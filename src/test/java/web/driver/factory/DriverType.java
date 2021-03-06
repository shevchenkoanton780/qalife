package web.driver.factory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.opera.*;
import org.openqa.selenium.remote.*;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;

import static web.driver.factory.DriverFactory.*;


public enum DriverType implements DriverSetup {
    FIREFOX {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            capabilities.setCapability("networkConnectionEnabled", true);
            capabilities.setCapability("browserConnectionEnabled", true);
            capabilities.setCapability("disable-web-security", true);
            capabilities.setJavascriptEnabled(true);
            return capabilities;
        }
        public WebDriver getWebDriverObject(DesiredCapabilities capabilities){
            System.setProperty("webdriver.firefox.marionette", "/Users/antonbear/IdeaProjects/qalife/src/test/resources/geckodriver");
            return new FirefoxDriver(capabilities);
        }
    },
    CHROME {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
//            options.setExperimentalOption("excludeSwitches",
//                    Collections.singletonList("enable-automation"));
//            capabilities.setCapability("chrome.switches", Collections.singletonList("--disable-extension"));
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            HashMap<String, String > chromePreference = new HashMap<>();
//            chromePreference.put("profile.password_manage_enabled", "false");
//            capabilities.setCapability("chrome.prefs", chromePreference);

            return capabilities;
        }
        public WebDriver getWebDriverObject(DesiredCapabilities capabilities){
            System.setProperty("webdriver.chrome.driver", "/Users/antonbear/IdeaProjects/qalife copy/src/test/resources/chromedriver");
            return new ChromeDriver(capabilities);
        }
    },

    Opera {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.opera();
            return capabilities;
        }
        public WebDriver getWebDriverObject(DesiredCapabilities capabilities){
//            File file = new File(new File(String.valueOf(DriverType.class.getClassLoader().getResource("operadriver"))).getPath());
//            System.setProperty("webdriver.opera.driver", file.toString());
            return new OperaDriver(capabilities);
        }
    }

}
