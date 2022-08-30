package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample2 {

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
		driver.get("https://www.saucedemo.com");
		// clicl on login button
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		//paasword field
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		// login field
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		

	}

}