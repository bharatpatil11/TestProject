package sellenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsellenium {

		
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // upcasting
			driver.get("https://www.facebook.com/");
		}
		
		

	}

