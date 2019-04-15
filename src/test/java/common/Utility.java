package common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import ui.LoginPage;

import java.io.File;
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
}

