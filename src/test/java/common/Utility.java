package common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.text.*;
import java.util.*;

public class Utility {
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
}

