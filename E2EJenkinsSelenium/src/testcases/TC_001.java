package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementByXPath("//input[@name='email']").sendKeys("Hello");
		driver.findElementByXPath("//input[@name='pass']").sendKeys("Hello");
		driver.quit();
	}


}
