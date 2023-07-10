package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FacebookTestNg {
	// pull Back
	@Test
	public void m2() {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	
	}

}
