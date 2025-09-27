package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;
	static Actions actions;
	static TakesScreenshot tc;
	static JavascriptExecutor javaScExe;
	static Alert alert;

	public static void launch(String url) { // launch browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	
	}

	public void textType(String id, String text) { // send text
		WebElement element = driver.findElement(By.id(id));
		element.sendKeys(text);
		
	}
   
	public void baseClick(String id) { // click
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}

	public void moveToElement(WebElement loc) { // move To Element
		actions = new Actions(driver);
		actions.moveToElement(loc);
	}

	public String textData(String loc) { // get text from browser
		WebElement text = driver.findElement(By.className(loc));
		return text.getText();
	}

	public String getCurrentUrl(WebElement loc) { // get URL from browser
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getPageTitle(WebElement loc) { // get title from browser
		String title = driver.getTitle();
		return title;
	}

	public void dragAndDrop(WebElement loc1, WebElement loc2) { // Drag and Drop
		actions.dragAndDrop(loc1, loc2).perform();
	}

	
	public String getAttribute(String attributeName) {
		WebElement element = driver.findElement(By.className(attributeName));
	    return element.getAttribute(attributeName);
	}
	public void clearText(String id) {
		WebElement element = driver.findElement(By.id(id));
		element.clear();

	}

	public boolean isElementDisplayed(WebElement loc) { // check if an element is displayed
		boolean displayed = loc.isDisplayed();
		return displayed;
	}

	public boolean isElementEnabled(WebElement loc) { // check if an element is enabled
		boolean enabled = loc.isEnabled();
		return enabled;
	}

	public boolean isElementSelected(WebElement loc) { // check if an element is selected
		boolean selected = loc.isSelected();
		return selected;
	}

	public String getCurrentHandle(WebElement loc) { // get the current window handle
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public void maxmizeWindow() { // maximize the window
		driver.manage().window().maximize();
	}

	public void minimixeWindow() { // minimize the window
		driver.manage().window().minimize();
	}

	public void quit() { // quit browser
		driver.quit();
	}

	public void SelectByIndex(String loc, int index) { // select options by index
		Select element =new Select(driver.findElement(By.id(loc)));
		element.selectByIndex(index);
	}

	public void SelectVisibleText(String loc, String text) { // select options by visible text
		Select element =new Select(driver.findElement(By.id(loc)));
		element.selectByVisibleText(text);
	}

	public void printAllOption(WebElement loc) { // print all options
		Select se = new Select(loc);
		List<WebElement> options = se.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public void windowHandles(int index) { // get window Handles using index
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(index));
	}

	public void javaScriptExecuter(WebElement loc, String text) { // send text using JavascriptExecutor
		javaScExe = (JavascriptExecutor) driver;
		javaScExe.executeScript("arguments[0].setAttribute('value')" + text, loc);
	}

	public void JavascriptExecutorBtn(WebElement loc) { // click button using JavascriptExecutor
		javaScExe = (JavascriptExecutor) driver;
		javaScExe.executeScript("arguments[0].click", loc);
	}

	public void acceptAlert() { // accept alert
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() { // dismiss Alert
		alert.dismiss();
	}

	public String getAlertText() { // get alert text
		String text = alert.getText();
		return text;
	}

	public void sendTextAlert(String text) { // send text to alert box
		alert.sendKeys(text);
		alert.accept();
	}

	public boolean isAlertPresent() { //check alert is present or not
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	
	public void setImplicitWait(int sec) { //implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public void explictWait(WebElement loc,int min) { //explict waits for button
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(min));
		wait.until(ExpectedConditions.elementToBeClickable(loc));
	}

	public void waitForAlert(int time) { //waits for alert to be present
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(time));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void ScreenShot(String path) throws IOException {
		TakesScreenshot tc=(TakesScreenshot)driver;
		File screenShots=tc.getScreenshotAs(OutputType.FILE);
		File f=new File(path);
		FileHandler.copy(screenShots, f);
	}
}

