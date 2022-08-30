package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AciveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromeexpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
//
System.setProperty("webdriver.chrome.driver", chromeexpath);
//
WebDriver driver=new ChromeDriver();
// maximum
driver.manage().window().maximize();
//
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//URL
driver.get("http://demo.automationtesting.in/Register.html");
//identify first name input field
WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
username.sendKeys("admin");
//create an instance of action
Actions element = new Actions(driver);
// perform an action
element.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}

}
