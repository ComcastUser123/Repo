package Tests;
import Pageobjects.Base;
import Pageobjects.DynamicLoading;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

import static org.junit.Assert.*; 

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;

public class testDynamicLoading {
private WebDriver driver;
private DynamicLoading dynamicLoading;
 
@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\Vishnu\\Selenium\\Selenium_PageObjects_Saucelabs_Source\\SeleniumDemo\\External JAR's\\chromedriver.exe");
    driver = new ChromeDriver();
    dynamicLoading = new DynamicLoading(driver);
}
 
@Test
public void hiddenElementLoads() {
    dynamicLoading.loadExample("1");
    assertTrue("finish text didn't display after loading",
            dynamicLoading.finishTextPresent());
}
 
@After
public void tearDown() {
    driver.close();
}
 
} 

