package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//maximize browser window
driver.manage().window().maximize();
// dont have minize concept in this it can bedone by setsize
driver.manage().window().setSize(new Dimension(450,600));
//maximize browse window
driver.manage().window().maximize();
driver.findElement(By.linkText("Forgot your password?")).click();
System.out.println("Forgot your password, page url: "+driver.getCurrentUrl());
//want to come back to previous page
		driver.navigate().back();
		System.out.println("Login page url: "+driver.getCurrentUrl());
		//want to go back to next page again
		driver.navigate().forward();
		System.out.println("Forgot your password, page url: "+driver.getCurrentUrl());
		//want to refresh /reload the current page
		driver.navigate().refresh();
		//want to move to other url
		driver.navigate().to("https://www.google.com");
	}

}
