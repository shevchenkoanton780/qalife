//package ui;
//
//import common.Utility;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import pages.LoginPage;
//import web.driver.factory.DriverFactory;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CBSInteractive extends LoginPage {
//
//    public static ArrayList<String> collecElementTxt(WebDriver driver, String xpath) {
//        List<WebElement> headerElements = driver.findElements(By.xpath(xpath));
//        ArrayList<String> eh = new ArrayList<String>();
//
//        for (int i = 0; i < headerElements.size(); i++) {
//            headerElements.get(i).getText();
//            eh.add(headerElements.get(i).getText());
//            System.out.println(headerElements.get(i).getText());
//            System.out.println("Total No of elements Available: " + eh.size());
//            System.out.println(eh.indexOf("About"));
//        }
//        return eh;
//    }
//
//    //    @Test (priority = 2)
////    @Parameters({"browser"})
////    public void verifyLogo(String browser)throws Exception {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.cbsinteractive.com/");
////        //Step 3 - Assertion the value
////        driver.findElement(By.xpath("/html/body/nav/div/a/img"));
////        if (driver.findElement(By.xpath("/html/body/nav/div/a/img")).isDisplayed()){
////            assert true;
////            System.out.print(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
////        } else {
////            assert false;
////            System.out.print(ANSI_RED_BACKGROUND + "FAILED! :( " + ANSI_RESET);
////        }
////    }
//    @Test(priority = 2)
//    @Parameters({"browser"})
//    public void verifyVideoLoopPreLoad(String browser) throws Exception {
//        //Step 1 - Opening the url
//        WebDriver driver = DriverFactory.getDriver(browser);
//        driver.get("https://www.cbsinteractive.com/");
//        //Step 2  - Finding the VideoLoopPreLoad
//        driver.findElement(By.xpath("//*[@id=\"introVideo\"]")).isDisplayed();
//        //Step 3 - Assertion the value
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"introVideo\"]")).isDisplayed());
//        System.out.println(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
//    }
//
//    @Test(priority = 2)
//    @Parameters({"browser"})
//    public void verifyheaderElements(String browser) throws Exception {
//        //Step 1 - Opening the url
//        WebDriver driver = DriverFactory.getDriver(browser);
//        driver.get("https://www.cbsinteractive.com/");
//        //Creating empty array
//        ArrayList<String> he = new ArrayList<>();
//
//            //Creating a loop
//
//            ArrayList<String> headerElements = collecElementTxt(driver, "/html/body/nav/div/div");
//
//            for (int l = 0; l < headerElements.size(); l++) {
//                he.add(headerElements.get(l));
//                Integer.parseInt();
//            }
//
//        }
//
//
//    }
//


