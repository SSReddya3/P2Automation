import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.*;


public class WriteDataExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("emp info");
		
		ArrayList<Object[]> empdata=new  ArrayList<Object[]>();
         empdata.add(new Object[] {"EmpId","Name","Job"});
          empdata.add(new Object[] {101,"Siva","Devaloper"});
          empdata.add(new Object[] {102,"Sankar","Tester"});
          empdata.add(new Object[] {103,"SSReddy","Enginner"});
          empdata.add(new Object[] {104,"ram","Manager"});
		
		int rowCount=0;
		
		
		for(Object[] emp:empdata)
		{
			XSSFRow row=sh.createRow(rowCount++);
			int calcount=0;
			for(Object value: emp)
			{
				XSSFCell cell=row.createCell(calcount++);
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
				
			}
		}
		
		String  file =".\\datafiles\\employee.xlsx";
		//FileOutputStream fos=new FileOutputStream(file);
		FileOutputStream fos =new FileOutputStream(".\\datafiles\\employee.xlsx");	
		
				wb.write(fos);
				fos.close();
				System.out.println("employee.xlsx file is created successfully");
				
				
				
				
				
				
				}

}
