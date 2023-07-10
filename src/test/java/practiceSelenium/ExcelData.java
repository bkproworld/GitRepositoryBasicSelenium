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

public class ExcelData {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		
		FileInputStream fes = new FileInputStream("./ExcelData.xlsx");
		
		Workbook book = WorkbookFactory.create(fes);
		
		Sheet sheet = book.getSheet("Input");
		
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(4);
		
		String Exceldata = cell.getStringCellValue();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Exceldata);
		

	}

}
