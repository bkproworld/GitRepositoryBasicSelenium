package TestNGQspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgMakemyTrip {
@Test
	public void main() {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
	}
}
