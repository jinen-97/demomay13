package selelilumbasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActTIMEPropertyFile {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// RELATABLE PATH
		FileInputStream file = new FileInputStream(".\\properties\\ActTime.properties");
		//instance of property
		Properties prop = new Properties();
		// load property
		prop.load(file);
		// read property
		/*
		System.out.println("driven key"+prop.getProperty("webdriver.chrome.driver"));
		System.out.println("driven executable"+prop.getProperty("driverExecutablePath"));
		System.out.println("appurl"+prop.getProperty("appUrl"));
		System.out.println("username"+prop.getProperty("username"));
		System.out.println("password"+prop.getProperty("password"));
		System.out.println("login page title"+prop.getProperty("loginPageTitle"));
		System.out.println("Button Name"+prop.getProperty("buttonName"));
		*/
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
		
		String chromeExePath=System.getProperty("user.dir")+executablePath;
		//setting the path for driver executable
		System.setProperty(driverKey, chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get(applicationUrl);
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedLoginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains(applicationUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
	
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();

		
		
	}

}
