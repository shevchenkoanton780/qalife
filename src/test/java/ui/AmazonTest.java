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
import org.testng.TestRunner;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import web.driver.factory.DriverFactory;

//import javax.validation.constraints.AssertTrue;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AmazonTest extends LoginPage {


    //    @Test(priority = 2)
    @Parameters("browser")
    public void AmazonSearchFieldTestPositive(String browser) {
        //Step 1 - Opening the url
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com/");
        //Step 2 - Pasting in the search field a key "textbooks"
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("textbooks");
        //Step 3 -  Search a key "textbooks"in the search field
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        //Step 4, 5 -  Assert value "textbooks"in the generated search list of textbooks. Print a result of test "Passed" or "Failed"
        if (driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\" and contains (., \"Textbook\")]")).isDisplayed()) {
            assert true;
            System.out.print(ANSI_GREEN_BACKGROUND + "PASSED! :) " + ANSI_RESET);
        } else {
            assert false;
            System.out.print(ANSI_RED_BACKGROUND + "FAILED! :( " + ANSI_RESET);
        }
    }
}
////
////    @Test(priority = 2)
////    @Parameters("browser")
////    public void AmazonSearchFieldTestNegative(String browser) {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Pasting in the search field a key "textbooks[iteration, 120 times]"
////        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("textbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbookstextbooks");
////        //Step 3 -  Search a key "textbooks"in the search field
////        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
////        //Step 4, 5 -  Assert value "494 Error"in the generated search list. Print a result of test "Passed" or "Failed"
////        if (driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).isDisplayed()) {
////            assert true;
////            System.out.print(ANSI_GREEN_BACKGROUND + "FAILED! :(" + "HAS TO OCCUR ERROR 494 " + ANSI_RESET);
////        } else {
////            assert false;
////            System.out.print(ANSI_RED_BACKGROUND + "PASSED! :)" + "494 Error IS DISPLAYED " + ANSI_RESET);
////        }
////    }
//
////    @Test(priority = 2)
////    @Parameters("browser")
////    public void AmazonLogoTestVerify(String browser) {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Verify Logo, located in the header
////        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).isDisplayed());
////        System.out.println(ANSI_GREEN_BACKGROUND + "Success!" + ANSI_RESET);
////    }
////}
////
////    @Test(priority = 2)
////    @Parameters("browser")
////    public void AmazonCaruselTestVerifyButton(String browser) {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Verify navigation of carusel
////       List<WebElement> CaruselElements = driver.findElements(By.xpath(""));
////        if (driver.findElement(By.xpath("//a[@class=\"a-carousel-goto-nextpage\"]"))) {
////        }
////       }
////
////
////        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).isDisplayed());
////        System.out.println(ANSI_GREEN_BACKGROUND + "Success!" + ANSI_RESET);
////    }
////}
//
////    @Test(priority = 2)
////    @Parameters("browser")
////    public void AmazonDropDownMenuTestVerifyMenuItems(String browser) {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Clicking on the drop down menu button, located in the header
////        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
////        //to catch all web elements into list
////        List<String> titles = new ArrayList<>();
////        ArrayList<String> MainMenuTitles = Utility.collectElementDropDownMenuAmazon(driver, "//div[@class=\"hmenu-item hmenu-title\"]");
//////        for (int i = 0; i < MainMenuTitles.size(); i++) {
//////            titles.add(MainMenuTitles.get(i));
//////            System.out.println(MainMenuTitles.get(i).findElements(By.xpath("//div[@class=\"hmenu-item hmenu-title\"]")).getText());
////        }
////    }
////}
//
//
//
//
////
////    @Test
////    @Parameters({"browser"})
////    public void yelpSearchSelenium(String browser)throws Exception{
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.yelp.com/search?find_desc=concreate&find_loc=Van+Nuys%2C+Los+Angeles%2C+CA&ns=1");
////        ArrayList<String> comp = Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc businessName__373c0__1fTgn border-color--default__373c0__2oFDT']");
////        ArrayList<String> ph = Utility.collecElementTxt(driver, "//*[@class='lemon--div__373c0__1mboc display--inline-block__373c0__2de_K u-space-b1 border-color--default__373c0__2oFDT']");
////        String yelpfile = System.getProperty("user.home")+"/Desktop/yelp.xls";
////        HSSFWorkbook workbook = new HSSFWorkbook();
////        HSSFSheet sheet = workbook.createSheet("Van Nuys");
////        HSSFRow rowhead = sheet.createRow((short)0);
////        rowhead.createCell(0).setCellValue("Companies");
////        rowhead.createCell(1).setCellValue("Phones");
////        for (int i = 0; i < comp.size(); i++) {
////            HSSFRow rows = sheet.createRow((short)i+1);
////            rows.createCell(0).setCellValue(comp.get(i));
////            rows.createCell(1).setCellValue(ph.get(i));
////        }
////        FileOutputStream fileOut = new FileOutputStream(yelpfile);
////        workbook.write(fileOut);
////        fileOut.close();
////        workbook.close();
////    }
//
////    @Test(priority = 2)
////    @Parameters("browser")
////    public void amazonSearchSeleniumAllPages(String browser) throws Exception {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Pasting in the search field a key "textbooks"
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sandblaster");
////        //Step 3 -  Search a key "sandblaster" in the search field
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
////        //Step 4 - Creating array list, named "sandblaster"
////        ArrayList<String> sandblaster = new ArrayList<>();
////        //Converting positive integer value String to int in Java
////
////        String links = driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")).getText();
////        int allpages = Integer.valueOf(links);
////        for (int i = 1; i < (allpages+2)/2; i++) {
////            // String to int conversion using Integer constructor and autoboxing
////
////////        int numberofAllPages = new Integer(pages);
////////        System.out.println("Integer created from String in Java : " + numberofAllPages);
//////        // Converting String to int using parseInt() method of java.lang.Integer
//////        int numberofAllPages = Integer.parseInt(links.replaceAll("(Page 1 of )", ""));
//////        System.out.println("String to int using parseInt()  : " + numberofAllPages);
////////        // String to int conversion using valueOf() method of Integer class
//////////        int numberofAllPages = Integer.valueOf(pages);
////////        System.out.println("String to int Conversion example using valueOf  : " + numberofAllPages);
//////        for (int i = 1; i < (allpages + 10) / 10; i++) {
////            driver.get("https://www.amazon.com/s?k=sandblaster&ref=nb_sb_noss_1" + i + "0");
////            ArrayList<String> amazonSandblaster = Utility.collectElementTxtAmazon(driver, "//li[@class=\"a-normal\"]");
//////            System.out.println(amazonSandblaster);
////            for (int l = 0; l < amazonSandblaster.size(); l++) {
////                sandblaster.add(amazonSandblaster.get(l));
////                for (int j = l + 1; j < sandblaster.size(); j++) {
////                    if (sandblaster.get(l).equals(sandblaster.get(j))) {
////                        sandblaster.remove(j);
////                        j--;
////                    }
////                }
////                String amazonfile = System.getProperty("user.home") + "/Desktop/amazon.xls";
////                HSSFWorkbook workbook = new HSSFWorkbook();
////                HSSFSheet sheet = workbook.createSheet("Amazon");
////                HSSFRow rowhead = sheet.createRow((short) 0);
////                rowhead.createCell(0).setCellValue("No.");
////                rowhead.createCell(1).setCellValue("Sandblaster");
////                for (l = 0; l < sandblaster.size(); l++) {
////                    HSSFRow rows = sheet.createRow((short) l + 1);
////                    rows.createCell(0).setCellValue((short) l + 1);
////                    rows.createCell(1).setCellValue(sandblaster.get(l));
////                }
////                FileOutputStream fileOut = new FileOutputStream(amazonfile);
////                workbook.write(fileOut);
////                fileOut.close();
////                workbook.close();
////            }
////        }
//////            System.out.println("After Removing duplicate:" + books);
////    }
////
//
//
//
//
////    @Test ( priority = 2 )
////    @Parameters("browser")
////    public void amazonSearchSeleniumAllPages(String browser) throws Exception {
////        //Step 1 - Opening the url
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        //Step 2 - Pasting in the search field a key "textbooks"
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("textbooks");
////        //Step 3 -  Search a key "textbooks"in the search field
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
////        //Step 4 - Creating array list, named "textbooks"
////        ArrayList<String> books = new ArrayList<>();
////
////        //Converting positive integer value String to int in Java
////        String pages = driver.findElement(By.xpath("//li[@class=\"a-normal\"]")).getText();
////
////        // String to int conversion using Integer constructor and autoboxing
//////        int numberofAllPages = new Integer(pages);
//////        System.out.println("Integer created from String in Java : " + numberofAllPages);
////       // Converting String to int using parseInt() method of java.lang.Integer
////       int numberofAllPages = Integer.parseInt(pages.replaceAll("(Page 1 of )", ""));
////        System.out.println("String to int using parseInt()  : " + numberofAllPages);
////        // String to int conversion using valueOf() method of Integer class
//////        int numberofAllPages = Integer.valueOf(pages);
//////        System.out.println("String to int Conversion example using valueOf  : " + numberofAllPages);
////        for (int i = 1; i < (numberofAllPages); i++) {
////            driver.get("https://www.amazon.com/s?k=textbooks&ref=nb_sb_noss_1" + i + "0");
////            ArrayList<String> amazonTextBooks = Utility.collectElementTxtAmazon(driver, "//a[@class=\"a-link-normal a-text-normal\"]");
//////            System.out.println(amazonTextBooks);
////            for (int l = 0; l < amazonTextBooks.size(); l++) {
////                books.add(amazonTextBooks.get(l));
////                for (int j = l + 1; j < books.size(); j++) {
////                    if (books.get(l).equals(books.get(j))) {
////                        books.remove(j);
////                        j--;
////                    }
////                }
////                String amazonfile = System.getProperty("user.home") + "/Desktop/amazon.xls";
////                HSSFWorkbook workbook = new HSSFWorkbook();
////                HSSFSheet sheet = workbook.createSheet("Amazon");
////                HSSFRow rowhead = sheet.createRow((short) 0);
////                rowhead.createCell(0).setCellValue("No.");
////                rowhead.createCell(1).setCellValue("Textbooks");
////                for (l = 0; l < books.size(); l++) {
////                    HSSFRow rows = sheet.createRow((short) l + 1);
////                    rows.createCell(0).setCellValue((short) l + 1);
////                    rows.createCell(1).setCellValue(books.get(l));
////                }
////                FileOutputStream fileOut = new FileOutputStream(amazonfile);
////                workbook.write(fileOut);
////                fileOut.close();
////                workbook.close();
////            }
////        }
////            System.out.println("After Removing duplicate:" + books);
//
////}
////    @Test
////    @Parameters("browser")
////    public void amazonSearchSeleniumAllPages(String browser)throws Exception{
////        WebDriver driver = DriverFactory.getDriver(browser);
////        driver.get("https://www.amazon.com/");
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("textbooks");
////        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
////        ArrayList<String> books = new ArrayList<>();
////        ArrayList<String> auth = new ArrayList<>();
////        String pages = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]")).getText();
////        System.out.println(ANSI_GREEN_BACKGROUND + "Check:" + driver.findElement(By.xpath("//*[@id='search']/span/h1/div/div[1]/div/div/span[3]")).getText() + ANSI_RESET);
////        int allpages = Integer.parseInt(pages.replaceAll("(Page 1 of )", ""));
////        for (int i = 1; i < (allpages+10)/10; i++) {
////            driver.get("https://www.amazon.com/s?k=textbooks&ref=is_s" + i + "0");
////            ArrayList<String> textbooks = Utility.collecElementTxt(driver, "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
////            ArrayList<String> authors = Utility.collecElementTxt(driver, "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/div/span[4]");
////            for (int l=0;l<textbooks.size();l++){
////                books.add(textbooks.get(l));
////                auth.add(authors.get(l));
////                for(int j=l+1;j<books.size();j++){
////                    if(books.get(l).equals(books.get(j))){
////                        books.remove(j);
////                        j--;
////                    }
////                }
////            }
////        }
//    }