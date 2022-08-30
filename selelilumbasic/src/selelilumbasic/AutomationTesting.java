package selelilumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path6= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path6);
// instance
WebDriver b2 = new ChromeDriver();
b2.get( "https://demo.automationtesting.in/Register.html");
// url check
String currenturl= b2.getCurrentUrl();
String expectedurl= ("https://demo.automationtesting.in/Register.html");
System.out.println("url ="+currenturl.contains(expectedurl));
// title 
String currenttitle= b2.getTitle();
String expectedtitle= ("Register");
System.out.println("title="+currenttitle.contains(expectedtitle));
// source page
String sourcepage= b2.getPageSource();
System.out.println("count="+sourcepage.length());
// find 
b2.close();

	}

}
