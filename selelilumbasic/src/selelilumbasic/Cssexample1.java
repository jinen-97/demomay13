package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
				String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromeExePath);
				//creating an instance of Chrome browser and up-casting it to WebDriver interface
				WebDriver driver=new ChromeDriver();
				//maximize browser window
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//enter application url
				driver.get("https://demosite.executeautomation.com/Login.html");
				// enter username
	driver.findElement(By.name("UserName")).sendKeys("execution");
	//password
	driver.findElement(By.name("Password")).sendKeys("admin");
	// login button
	driver.findElement(By.cssSelector("input[name='Login']")).click();
	System.out.println("Hi");
	
	
	}

}
