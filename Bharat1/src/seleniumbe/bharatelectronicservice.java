package seleniumbe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bharatelectronicservice {
	public static void main(String[] args) throws InterruptedException {
		
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.get("https://bharatelectronicservice.com/#service");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a [@href='#contact']")).click();

}
}