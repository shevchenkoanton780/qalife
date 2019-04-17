package common;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import ui.LoginPage;

import java.io.File;
import java.io.FileOutputStream;
import java.text.*;
import java.util.*;

public class Utility extends LoginPage {

    public static void waitUntilElementDisplayed(WebDriver driver, int sec, By xpath){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
    }

    public static void waitUntilElementDisappear(WebDriver driver, int sec, By xpath){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }

    public static String toCurrency(double number){
        Locale loc = new Locale("en", "US");
        NumberFormat curForm = NumberFormat.getCurrencyInstance(loc);
        System.out.print("Converted to currency: " + curForm.format(number) + "\n");
        return curForm.format(number);
    }

    public static void clickJs(WebDriver driver, String element){
        WebElement button = driver.findElement(By.id(element));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", button);
    }

    public static void waitForUrlContains(WebDriver driver, String expectedString, int TIMEOUT) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.urlContains(expectedString));    }

    public static File[] readAllNamesFilesFromDesktop() {
        File folder = new File(System.getProperty("user.home"), "/Desktop");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        return listOfFiles;
    }

    public static void deleteFileOnDesktop(File namefile) {
        File xx = new File(System.getProperty("user.home"), "/Desktop/"+namefile);
        if (xx.exists()) {
            xx.delete();
        }
    }

    public static void collecElementTxt(WebDriver driver, String xpath, int integ, String nameoffile) throws Exception{
        List<WebElement> phones = driver.findElements(By.xpath(xpath));
        ArrayList<String> ph = new ArrayList<String>();
        System.out.println("Total no of links Available: " + phones.size());
        for (int i = 0; i < phones.size(); i++) {
            phones.get(i).getText();
            ph.add(phones.get(i).getText());
            System.out.println(phones.get(i).getText());
        }
        String yelpfile = System.getProperty("user.home")+"/Desktop/"+nameoffile;
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Van Nuys");
        HSSFRow rowhead = sheet.createRow((short)0);
        rowhead.createCell(integ).setCellValue("Company");
        rowhead.createCell(2).setCellValue("Phone");
        for (int i = 0; i < ph.size(); i++) {
            sheet.createRow((short)i).createCell(2).setCellValue(ph.get(i));
        }
        FileOutputStream fileOut = new FileOutputStream(yelpfile);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
}

