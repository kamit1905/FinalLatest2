package app.sunbeam.WaitHelper;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

import com.app.sunbeam.Driver.DriverManager;

public class WaitHelper {
	//Checking first commit
	
	public void setImplicitWait(long timeOut) {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}
	
	public WebDriverWait getWait(long timeOut) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeOut));
		return wait;
	}
	
	public WebElement WaitForElementVisible(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public Boolean WaitForElementInvisible(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public WebElement WaitForElementToBeClickable(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean WaitForElementToBeSelected(WebElement element,long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		return wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void WaitforAlert(long timeOut) {
		WebDriverWait wait = getWait(timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public Wait<WebDriver> FluentWait(long timeOut,long pollingEvery) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(DriverManager.getDriver())
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingEvery))
				.ignoring(NoSuchElementException.class);
		 return fluentWait;
	}
	
	public void checkRebaseFunctionality() {
		//check rebase funcationality
	}
}
