package testNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGSample {
	
		@Test
		public void enterIBM() {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivek\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("THE GREAT");
			
		}
				
}
