package com.voices.managers;

import com.voices.enums.DriverType;
import com.voices.enums.EnvironmentType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.HashMap;

public class DriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static EnvironmentType environmentType;

    
    public static  String USERNAME = ReaderManager.getInstance().getConfigReader().getSauceUserName();
    public static  String ACCESSKEY = ReaderManager.getInstance().getConfigReader().getSauceAccessKey();
    public static String sauceTunnel =  ReaderManager.getInstance().getConfigReader().getSauceTunnelName();
    public static String PLATFORMNAME = "Windows 10";

    URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");

    public DriverManager() throws MalformedURLException {
        driverType = ReaderManager.getInstance().getConfigReader().getBrowser();
        environmentType = ReaderManager.getInstance().getConfigReader().getEnvironment();
    }

    public WebDriver getDriverForLaunch() throws MalformedURLException {
        if (driver == null) {
            driver = createDriverForLaunch();
        }
        return driver;
    }

    private WebDriver createDriverForLaunch() throws MalformedURLException {
        switch (environmentType) {
            case LOCAL:
                driver = createLocalDriverForLaunch();
                break;
            case REMOTE:
                driver = createRemoteDriver();
                break;
        }
        return driver;
    }

    private WebDriver createLocalDriverForLaunch() {
        switch (driverType) {
            case CHROME:
             //   WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().clearDriverCache().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().clearDriverCache().setup();
                driver = new EdgeDriver();
                break;

        }
        if (ReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) {
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
        return driver;
    }

    private WebDriver createRemoteDriver() throws MalformedURLException {
        switch (driverType) {
            case CHROME:
                ChromeOptions browserOptions = new ChromeOptions();
                //   browserOptions.addArguments("--headless");
                browserOptions.setPlatformName(PLATFORMNAME);
                Map<String, Object> sauceOptions = new HashMap<>();
                sauceOptions.put("username", USERNAME);
                sauceOptions.put("accessKey", ACCESSKEY);
                sauceOptions.put("build", "selenium-build-DEXMW");
                sauceOptions.put("name", "Automation_Exectution_Voices");
                sauceOptions.put("screenResolution", "1680x1050");
              //  sauceOptions.put("tunnelIdentifier", sauceTunnel);
                browserOptions.setCapability("sauce:options", sauceOptions);
                // sauceOptions.put("headless", true ); // Enable headless mode
                driver = new RemoteWebDriver(url, browserOptions);
                break;
            case FIREFOX:
                FirefoxOptions firefoxbrowserOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().clearDriverCache().setup();
                firefoxbrowserOptions.setPlatformName(PLATFORMNAME);
                Map<String, Object> sauceFireFoxOptions = new HashMap<>();
                sauceFireFoxOptions.put("username", USERNAME);
                sauceFireFoxOptions.put("accessKey", ACCESSKEY);
                sauceFireFoxOptions.put("build", "selenium-build-DEXMW");
                sauceFireFoxOptions.put("name", "Automation_Exectution_Voices");
                sauceFireFoxOptions.put("tunnelIdentifier",sauceTunnel);
                sauceFireFoxOptions.put("screenResolution", "1680x1050");
                // sauceOptions.put("sauce:options", "{ \"headless\": true }"); // Enable headless mode
                firefoxbrowserOptions.setCapability("sauce:options", sauceFireFoxOptions);
                driver = new RemoteWebDriver(url, firefoxbrowserOptions);
                break;
            case EDGE:
                EdgeOptions EdgebrowserOptions = new EdgeOptions();
                EdgebrowserOptions.setPlatformName(PLATFORMNAME);
                Map<String, Object> sauceEdgeOptions = new HashMap<>();
                sauceEdgeOptions.put("username", USERNAME);
                sauceEdgeOptions.put("accessKey", ACCESSKEY);
                sauceEdgeOptions.put("build", "selenium-build-DEXMW");
                sauceEdgeOptions.put("name", "Automation_Exectution_Voices");
                sauceEdgeOptions.put("tunnelIdentifier",sauceTunnel);
                sauceEdgeOptions.put("screenResolution", "1680x1050");
                EdgebrowserOptions.setCapability("sauce:options", sauceEdgeOptions);
                driver = new RemoteWebDriver(url, EdgebrowserOptions);
                break;

        }
        return driver;

    }

    public void closeDriver() {
        driver.quit();
    }


}

