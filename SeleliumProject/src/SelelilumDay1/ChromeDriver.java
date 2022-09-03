package SelelilumDay1;

public class ChromeDriver {
	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver", 
				"E:\\accelerationeclipse\\SeleliumProject\\src\\SelelilumDay1\\ChromeDriver.java");
		
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		//close the current browser
	
	}
}
