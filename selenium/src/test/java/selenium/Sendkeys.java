package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sendkeys {

	By username = By.id("email");
	By password = By.id("pass");
	By login=By.xpath("//button[@name='login']"); 
	By logo=By.xpath("//img[@class='fb_logo _8ilh img']");
	public static WebDriver driver;

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bangarayya\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(validatefaceBookLogo(logo));		
		sendkeys(username,"798967678408");
		sendkeys(password,"gshdhfahej");
		//click(login);

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void sendkeys(By locator,String username) {
	
	getElement(locator).sendKeys(username);
	
	}

	public void click(By locator) {
	
		getElement(locator).click();
	}
	public boolean validatefaceBookLogo(By locator) {
		
		return getElement(locator).isDisplayed();
	}
}
