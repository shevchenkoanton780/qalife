package ui;

import common.*;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import web.driver.factory.DriverFactory;
import java.io.*;
import java.util.*;

public class YelpFindAllNamesPhones extends LoginPage {

    @Test
    @Parameters({"browser"})
    public void yelpSearchSeleniumAllPages(String browser)throws Exception {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.yelp.com/");
        driver.findElement(By.id("find_desc")).sendKeys("concreate");
        driver.findElement(By.id("dropperText_Mast")).clear();
        driver.findElement(By.id("dropperText_Mast")).sendKeys("Van Nuys");
        driver.findElement(By.id("dropperText_Mast")).sendKeys(Keys.ENTER);
        ArrayList<String> comps = new ArrayList<>();
        ArrayList<String> phs = new ArrayList<>();
        String pages = driver.findElement(By.xpath("//*[@role='navigation']//span[1]")).getText();

        int allpages = Integer.parseInt(pages.replaceAll("(Page 1 of )", ""));
        for (int i = 1; i < (allpages+10)/10; i++) {
            driver.get("https://www.yelp.com/search?find_desc=concreate&find_loc=Van%20Nuys&ns=1&start=" + i + "0");
            ArrayList<String> companies = Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc businessName__373c0__1fTgn border-color--default__373c0__2oFDT']");
            ArrayList<String> phones = Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc display--inline-block__373c0__2de_K u-space-b1 border-color--default__373c0__2oFDT']");
            for (int l=0;l<companies.size();l++){
                comps.add(companies.get(l));
                phs.add(phones.get(l));
                for(int j=l+1;j<comps.size();j++){
                    if(comps.get(l).equals(comps.get(j))){
                        comps.remove(j);
                        j--;
                    }
                }
            }
        }
        System.out.println("After Removing duplicate:" + comps);
        String yelpfile = System.getProperty("user.home") + "/Desktop/yelp.xls";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Van Nuys");
        HSSFRow rowhead = sheet.createRow((short) 0);
        rowhead.createCell(0).setCellValue("Companies");
        rowhead.createCell(1).setCellValue("Phones");
        for (int l = 0; l < comps.size(); l++) {
            HSSFRow rows = sheet.createRow((short) l + 1);
            rows.createCell(0).setCellValue(comps.get(l));
            rows.createCell(1).setCellValue(phs.get(l));
        }   FileOutputStream fileOut = new FileOutputStream(yelpfile);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
//        Utility.deleteFileOnDesktop(new File(yelpfile));
    }
}
