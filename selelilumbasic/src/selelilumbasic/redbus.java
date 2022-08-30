package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeExPath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",chromeExPath);

		WebDriver driver= new ChromeDriver();
		//maximize browser window
				driver.manage().window().maximize();
				driver.get("https://www.redbus.in/");
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

				WebElement from= driver.findElement(By.id("src"));
				from.sendKeys("PUNE");
	//	from.findElement(By.className(".autoFill.homeSearch"));
				from.findElement(By.xpath("//section/div/div/div/ul/li[2]")).click();
				from.click();
				
	WebElement to= driver.findElement(By.id("dest"));
	to.sendKeys("MUMBAI");
	
	
	}

}
