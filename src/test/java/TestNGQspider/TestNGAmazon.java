package TestNGQspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGAmazon {
	@Test
	public void amaz() {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}

}
