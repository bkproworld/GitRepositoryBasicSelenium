package practiceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchNaukri {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		FileInputStream fis = new FileInputStream("./Naukri.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("un");
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		
		
		String Exceldata = cell.getStringCellValue();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(Exceldata);
		Row row1 = sheet.getRow(2);
		Cell cell1 = row1.getCell(2);
		
		
		String Exceldata1 = cell1.getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Exceldata1);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	}

}
