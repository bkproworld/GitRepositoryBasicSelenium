package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngCricbuzz {
	@Test
	public void cric() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
	}

}
