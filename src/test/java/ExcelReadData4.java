import static org.testng.Assert.*;

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

public class ExcelReadData4 {
	
	WebDriver driver;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	
public void LoginTest() throws InterruptedException, IOException 
{
		
		FileInputStream fis= new FileInputStream(".\\datafiles\\inputstreem.xlsx");
			 wb= new XSSFWorkbook(fis);
	         sh =wb.getSheet("Sheet1");
}
	
	@Test(dataProvider =addition)
	public void add(int a,int b, int c ) 
	{
		
		int value =a+b;
		//assert.assertEquals(value, c);
		assert.assertEquals(value, c);
	}
	
	@DataProvider(name="addition")
	Public object[][]  data()
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
