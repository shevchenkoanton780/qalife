package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import web.driver.factory.DriverFactory;

public class AmazonListOfTextbooks extends LoginPage {

    @Test
    @Parameters({"browser"})
    public void amazonSearchSeleniumAllPages(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("textbooks");





    }
}
