package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import ui.LoginPageAT;
import web.driver.factory.DriverFactory;


    public class AmazonTest1 extends LoginPageAT {


        public void gtest(String browser) {

            WebDriver driver = DriverFactory.getDriver(browser);
            driver.get("https://www.google.com");

        }
    }