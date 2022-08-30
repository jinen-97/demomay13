package selelilumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> menuoptioncount=driver.findElements(By.cssSelector("div#container>div>div"));
		System.out.println("menu option count = "+menuoptioncount.size());
		for(int i=0;i<menuoptioncount.size();i++) {
			WebElement element=menuoptioncount.get(i);
			System.out.println(element.getText());
			
		}
	}

}
