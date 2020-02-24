package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import web.driver.factory.DriverFactory;


public class appleTVPlus extends LoginPage
{
    @Test (priority = 2)
    @Parameters("browser")
    public void  VerifyLandingPageHeaderTVElement(String browser) throws InterruptedException
    {
        //Step 1 - Opening the url
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.apple.com/");
        Thread.sleep(3);
        //Step 2 - Navigate to header with element TV on the landing page
        if (driver.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[6]/a")).isDisplayed())
        {
            assert true;
            System.out.print(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else
        {
            assert false;
            System.out.print(ANSI_RED_BACKGROUND + "FAILED! :( " + ANSI_RESET);
        }
    }

    @Test (priority = 2)
    @Parameters("browser")
    public void  VerifyLandingPageAppleTV(String browser) throws InterruptedException
    {
         //Step 1 - Opening the url
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.apple.com/");
        Thread.sleep(3);
        //Step 2 - Navigate to AppleTV+ on the landing page
        driver.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[6]/a")).click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.apple.com/tv/");
        System.out.print(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
    }

    @Test(priority = 2)
    @Parameters("browser")
    public void  VerifyLogoTest(String browser) throws InterruptedException
    {
    //Step 1 - Opening the url
    WebDriver driver = DriverFactory.getDriver(browser);
    driver.get("https://www.apple.com/apple-tv-plus/");
    Thread.sleep(3);
    //Step 2 - Searching AppleTV+ on the landing Page
    if (driver.findElement(By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[1]/a")).isDisplayed())
    {
        assert true;
        System.out.print(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
    } else
    {
        assert false;
        System.out.print(ANSI_RED_BACKGROUND + "FAILED! :( " + ANSI_RESET);
    }
}


}
