package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    @Parameters({"browserName", "os", "url"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browserName, @Optional("windows") String os, @Optional("http:\\www.amazon.com") String url) {
        getLocalDriver(browserName, os);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeOut() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }


    public WebDriver getLocalDriver(String browserName, String os) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/windows/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/mac/chromedriver");
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/drivers/windows/geckodriver.exe");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/drivers/mac/geckodriver");
                driver = new ChromeDriver();
            }


        }
        return driver;
    }

}



