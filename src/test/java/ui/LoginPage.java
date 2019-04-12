package ui;

import common.Xls_Reader;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;


import java.util.Date;

import static org.testng.Assert.assertEquals;

public class LoginPage {
    public WebDriver driver;
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";

    @BeforeSuite
    public void BeforeSuite() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/webdrivers/geckodriver");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("marionette", true);
        caps.setCapability("networkConnectionEnabled", true);
        caps.setCapability("browserConnectionEnabled", true);
        caps.setCapability("disable-web-security", true);
        caps.setJavascriptEnabled(true);
        driver = new FirefoxDriver(caps);
    }

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }


    @Test()
    public void GoogleTest1() throws Exception{
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='LC20lb'])[1]")).getText().contains("Selenium WebDriver"));
        System.out.print("Element: " + driver.findElement(By.xpath("(//*[@class='LC20lb'])[1]")).getText() + " displayed\n");
        System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);
    }

    @Test
    public void GoogleTest2() throws Exception{
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("monster jobs");
        driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
        if(driver.findElement(By.xpath("//*[contains(text(), 'Searches related to monster jobs')]")).isDisplayed()){
            assert true;
            System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);
        }
        else
            {assert false;}
    }
    @Test
    public void GoogleTest3() throws Exception{
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("stackoverflow");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='LC20lb'])[1]")).isDisplayed());
        System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);

    }

    //DD-2185Verify submit button in landing page
    @Test
    public void VerifySubBtnInLandingPage() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("stackoverflow");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='LC20lb'])[1]")).isDisplayed());
        System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);
    }

    @Test
    public void VerifyDropDownEbayHalf() throws InterruptedException {
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByVisibleText("California");
        System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);
    }

    @Test
    public void VerifyFillOutHalf() throws InterruptedException {
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url


        //Data Driven Approach (Parameterization) -- used to create data driven framework: driving the test data from excel files

        //get test data from excel:
        Xls_Reader reader = new Xls_Reader("/Users/val/Desktop/qastarting_repo/src/test/java/testdata/HalfEbayTestData.xlsx\n");
        int rowCount = reader.getRowCount("RegTestData");

        reader.addColumn("RegTestData", "Status");

        //Parameterization:
        for(int rowNum = 2; rowNum<=rowCount; rowNum++){
            System.out.println("=====");
            String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
            System.out.println(firstName);

            String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
            System.out.println(lastName);

            String address1 = reader.getCellData("RegTestData", "address1", rowNum);
            System.out.println(address1);

            String address2 = reader.getCellData("RegTestData", "address2", rowNum);
            System.out.println(address2);

            String city = reader.getCellData("RegTestData", "city", rowNum);
            System.out.println(city);

            String state = reader.getCellData("RegTestData", "state", rowNum);
            System.out.println(state);

            String zipCode = reader.getCellData("RegTestData", "zipcode", rowNum);
            System.out.println(zipCode);

            String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
            System.out.println(emailAddress);

            //enter data:
            driver.findElement(By.xpath("//*[@id='firstname']")).clear();
            driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);

            driver.findElement(By.xpath("//*[@id='lastname']")).clear();
            driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);

            driver.findElement(By.xpath("//*[@id='address1']")).clear();
            driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);

            driver.findElement(By.xpath("//*[@id='address1']")).clear();
            driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address2);

            driver.findElement(By.xpath("//*[@id='city']")).clear();
            driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);

            Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
            select.selectByVisibleText(state);

            driver.findElement(By.xpath("//*[@id='zip']")).clear();
            driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);

            driver.findElement(By.xpath("//*[@id='email']")).clear();
            driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailAddress);

            driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
            driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailAddress);

            reader.setCellData("RegTestData", "Status", rowNum, "Pass"); //write the data into a cell

        }
        System.out.print(ANSI_GREEN_BACKGROUND + "SUCCESS! " + ANSI_RESET);
    }

    @Test
    public void VerifyFillOutHalf2() throws InterruptedException {
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
        //get test data from excel:
        Xls_Reader reader = new Xls_Reader("/Users/val/Desktop/qastarting_repo/src/test/java/testdata/HalfEbayTestData.xlsx\n");

        String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);

        String lastName = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastName);

    String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);

    String address2 = reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);

    String city = reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);

    String state = reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);

    String zipCode = reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipCode);

    String emailAddress = reader.getCellData("RegTestData", "emailaddress", 2);
		System.out.println(emailAddress);


		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);

		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);

		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);

		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address2);

		driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);

        Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
		select.selectByVisibleText(state);

		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailAddress);

}
}

