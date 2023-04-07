package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.get("https://www.facebook.com/login.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("8767846768");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("patil@3896");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
