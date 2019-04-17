package ui;

import common.Utility;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class YelpFindAllNamesPhones extends LoginPage {
    @Test
    public void verifyLogoDatafaction()throws Exception{
//        driver.get("http://www.yelp.com");
        driver.get("https://www.yelp.com/search?find_desc=concreate&find_loc=Van+Nuys%2C+Los+Angeles%2C+CA&ns=1");
        Utility.waitUntilElementDisplayed(driver,10, By.xpath("(//*[@class='pseudo-input_field-holder'])[1]"));
//        WebElement field = driver.findElement(By.xpath("(//*[@class='pseudo-input_field-holder'])[1]"));
//        WebElement fieldcity = driver.findElement(By.xpath("(//*[@class='pseudo-input_field-holder'])[2]"));
//        Utility.waitUntilElementDisplayed(driver,10, By.xpath("(//*[@class='pseudo-input_field-holder'])[1]"));
//        field.click();
//        field.sendKeys("concreate");
//        fieldcity.click();
//        fieldcity.sendKeys("Van Nuys");
//        field.sendKeys(Keys.ENTER);
        ArrayList<String> comp = new ArrayList<String>();
        ArrayList<String> ph = new ArrayList<String>();
        List<WebElement> companies = driver.findElements(By.xpath("//*[@class='lemon--div__373c0__1mboc businessName__373c0__1fTgn border-color--default__373c0__2oFDT']"));
        System.out.println("Total no of links Available: " + companies.size());
        for (int i = 0; i < companies.size(); i++) {
            companies.get(i).getText();
            comp.add(companies.get(i).getText());
            System.out.println(companies.get(i).getText());
        }
//        System.out.println(comp);
//        Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc display--inline-block__373c0__2de_K u-space-b1 border-color--default__373c0__2oFDT']");
//        List<WebElement> phones = driver.findElements(By.xpath("//*[@class='lemon--div__373c0__1mboc display--inline-block__373c0__2de_K u-space-b1 border-color--default__373c0__2oFDT']"));
//        System.out.println("Total no of links Available: " + phones.size());
//        for (int i = 0; i < phones.size(); i++) {
//            phones.get(i).getText();
//            ph.add(phones.get(i).getText());
//            System.out.println(phones.get(i).getText());
////            System.out.println(phones2.get(i).getText());
//        }
////        System.out.println(ph);
//
        String yelpfile = System.getProperty("user.home")+"/Desktop/yelp.xls";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Van Nuys");
        HSSFRow rowhead = sheet.createRow((short)0);
        rowhead.createCell(1).setCellValue("Companies");
        rowhead.createCell(2).setCellValue("Phones");
        for (int i = 0; i < ph.size(); i++) {
            sheet.createRow((short)i).createCell(1).setCellValue(comp.get(i));
            sheet.createRow((short)i).createCell(2).setCellValue(ph.get(i));
        }
        FileOutputStream fileOut = new FileOutputStream(yelpfile);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

    }

    @Test
    public void verifyLogoDatafaction2()throws Exception{
        driver.get("https://www.yelp.com/search?find_desc=concreate&find_loc=Van+Nuys%2C+Los+Angeles%2C+CA&ns=1");
        Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc businessName__373c0__1fTgn border-color--default__373c0__2oFDT']", 1, "yelp1.xls");
        Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc display--inline-block__373c0__2de_K u-space-b1 border-color--default__373c0__2oFDT']", 1, "yelp2.xls");
    }

}
