package Pageobjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoading extends Base{
	By startButton = By.cssSelector("#start button");
	By finishText  = By.id("finish");
	
	public DynamicLoading(WebDriver _driver){
		super(_driver);
	}
	
	public void loadExample(String exampleNumber) {
	    visit("http://the-internet.herokuapp.com/dynamic_loading/" + exampleNumber);
	    click(startButton);
	}
	
	public Boolean finishTextPresent() {
	   return waitForIsDisplayed(finishText, 10);
	   
	}
	

	
}
