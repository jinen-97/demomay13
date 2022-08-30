package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		// enter user details
		
		// enter password
	
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test@123");
		//enter singup button
		driver.findElement(By.cssSelector("[class='button buttonBlue']")).click();
		// click on button and scroll down
		driver.findElement(By.cssSelector("[class='btn btn-default addButton dropdown-toggle']")).click();
		driver.findElement(By.cssSelector("[data-name='History']")).click();
		
		
		
	}

	
	}


