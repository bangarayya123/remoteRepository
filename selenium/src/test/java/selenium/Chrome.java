package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {

	
	

	@Test
	public void add() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bangarayya\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
}
