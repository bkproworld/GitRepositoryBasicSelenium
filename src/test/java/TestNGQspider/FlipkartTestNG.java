package TestNGQspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTestNG {
	@Test
	public void flipkart() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}

}
