package practiceSelenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot {
	@Test
	public void m1() throws Throwable{
	
	
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
//	TakesScreenshot screen =(TakesScreenshot)driver;
//	File src = screen.getScreenshotAs(OutputType.FILE);
//	File dest = new File("Screenshot.png");
	
	TakesScreenshot screen = (TakesScreenshot)driver;
	File src = screen.getScreenshotAs(OutputType.FILE);
	File dest = new File("TakeScreenshot.png");
	FileUtils.copyFile(src, dest);
			
		
	
	
}

}
