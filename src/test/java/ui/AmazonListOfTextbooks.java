package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import web.driver.factory.DriverFactory;

public class AmazonListOfTextbooks extends LoginPage {

    @Test(priority = 1)
    @Parameters({"browser"})
    public void verifySearchButton1(String browser) throws InterruptedException {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("textbooks");

        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).sendKeys(Keys.ENTER);

        Thread.sleep(3);
        if (driver.findElement(By.xpath("//*[@id='search']/span[2]/h1/div/div[1]/div")).isDisplayed()) {
            assert true;
            System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else {
            assert false;
            System.out.println(ANSI_RED_BACKGROUND + "FAILED! :* " + ANSI_RESET);
        }
    }

    @Test(priority = 1)
    @Parameters({"browser"})
    public void verifySearchButton2(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        if (driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).isDisplayed()) {
            assert true;
            System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else {
            assert false;
            System.out.println(ANSI_RED_BACKGROUND + "FAILED! :* " + ANSI_RESET);
        }
    }

    @Test(priority = 1)
    @Parameters({"browser"})
    public void verifySearchButton3(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        if (driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).isDisplayed() & driver.findElement(By.id("nav-search-submit-text")).isDisplayed()) {
            assert true;
            System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else {
            assert false;
            System.out.println(ANSI_RED_BACKGROUND + "FAILED! :* " + ANSI_RESET);
        }


    }

    @Test(priority = 1)
    @Parameters({"browser"})
    public void verifySearchButton4(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        if (driver.findElement(By.className("nav-right")).isDisplayed()) {
            assert true;
            System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else {
            assert false;
            System.out.println(ANSI_RED_BACKGROUND + "FAILED! :* " + ANSI_RESET);
        }


    }
    @Test(priority = 1)
    @Parameters({"browser"})
    public void verifySearchButton5(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
  //    ?????  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
//        if (driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click()) {
//            assert true;
//            System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
//        } else {
//            assert false;
//            System.out.println(ANSI_RED_BACKGROUND + "FAILED! :* " + ANSI_RESET);
//        }


    }
}

