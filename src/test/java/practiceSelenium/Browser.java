package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		
	}

}
