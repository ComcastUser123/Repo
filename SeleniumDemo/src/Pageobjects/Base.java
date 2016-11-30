package Pageobjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	private WebDriver driver;
	
	public Base(WebDriver _driver){
		driver = _driver;
	}
	
	protected void visit(String value) {
		driver.get(value);
	}
	
	protected void click(By startButton2) {
		driver.findElement(startButton2).click();
	}
	
	 public Boolean waitForIsDisplayed(By locator, Integer... timeout) { 
	        try { 
	            waitFor(ExpectedConditions.visibilityOfElementLocated(locator), 
	                    (timeout.length > 0 ? timeout[0] : null)); 
	        } catch (org.openqa.selenium.TimeoutException exception) {
	             return false; 
	        }
	        return true; 
	    }
	 
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeout) {
	    timeout = timeout != null ? timeout : 5;
	    WebDriverWait wait = new WebDriverWait(driver, timeout);
	    wait.until(condition);
	}
	 
}
