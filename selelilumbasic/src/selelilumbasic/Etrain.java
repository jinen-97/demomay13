package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etrain {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
String chromeExPath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";

System.setProperty("webdriver.chrome.driver",chromeExPath);

WebDriver driver= new ChromeDriver();
//maximize browser window
		driver.manage().window().maximize();

driver.get("https://etrain.info/in");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

WebElement from =driver.findElement(By.id("tbsfi1"));
from.click();
Thread.sleep(1000);
from.sendKeys("PUNE");
//from.findElement(By.xpath("//*[contains(text(),'PUNE')]"));
from.findElement(By.cssSelector("a>b:nth-of-type(1)")).click();

	
WebElement to = driver.findElement(By.name("station2"));
Thread.sleep(200);
to.sendKeys("MUMBAI");
Thread.sleep(200);
to.findElement(By.id("#suggest_row2"));
to.findElement(By.cssSelector("a>b:nth-of-type(2)")).click();
	}

}
