import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.*;

public class ExcelReadData2 {
	WebDriver driver;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	@BeforeClass

	public void browserlanch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	@AfterClass

	public void BrowserClose() {
		driver.close();
	}

	
public void LoginTest() throws InterruptedException, IOException {
		
		FileInputStream fis= new FileInputStream(".\\datafiles\\inputstreem.xlsx");
		
		
		 wb= new XSSFWorkbook(fis);
	
	XSSFSheet sh =	wb.getSheet("Sheet1");
}
	@Test(dataProvider =logindata)

		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PWD_str);
		 
		
	}
	@DataProvider(name="logindata")
	
	
	Public object[][] data()
	{
		
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rowcount;r++)
		{
			XSSFRow row=sh.getRow(r);
			
			for(int c=0;c<colcount;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch (cell.getCellType()) 
				{
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
                
				
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}
	
	
}
