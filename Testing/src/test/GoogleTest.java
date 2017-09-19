package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GoogleTest {

	@Test
	public void t() throws IOException{
		
		 WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "browsers/geckodriver.exe");
			
			driver = new FirefoxDriver();
	        //driver = new FirefoxDriver();
	        //not a testing files
	        //hello
	        driver.get("http://www.flipkart.com");
	        
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);	
//	        String excelFilePath = "testdata/Book1.xls";
//	        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//	         
//	        Workbook workbook = new HSSFWorkbook(inputStream);
//	        Sheet firstSheet = workbook.getSheet("Sheet1");
//	        
//	        int startIndex=firstSheet.getFirstRowNum();
//	        int endIndex=firstSheet.getLastRowNum();
//	        System.out.println(startIndex);
//	        System.out.println(endIndex);
//	        
//	        for(int i=startIndex;i<=endIndex;i++){
//	        	Row row=firstSheet.getRow(i);
//	        	int columnStartIndex=row.getFirstCellNum();
//	        	int columnEndIndex=row.getLastCellNum();
//	        	System.out.println(columnStartIndex);
//	        	System.out.println(columnEndIndex);
//	        	driver.findElement(By.id("user")).sendKeys(row.getCell(0).getStringCellValue());
//	        	driver.findElement(By.id("pwd")).sendKeys(row.getCell(1).getStringCellValue());
//	        	driver.findElement(By.id("signinbutton")).click();
//	        	
//	        	
//	        }
//	        //Iterator<Row> iterator = firstSheet.iterator();
//	         
//	        /*while (iterator.hasNext()) {
//	            Row nextRow = iterator.next();
//	            Iterator<Cell> cellIterator = nextRow.cellIterator();
//	             
//	            while (cellIterator.hasNext()) {
//	                Cell cell = cellIterator.next();
//	                 
//	                switch (cell.getCellType()) {
//	                    case Cell.CELL_TYPE_STRING:
//	                        System.out.print(cell.getStringCellValue());
//	                        break;
//	                    case Cell.CELL_TYPE_BOOLEAN:
//	                        System.out.print(cell.getBooleanCellValue());
//	                        break;
//	                    case Cell.CELL_TYPE_NUMERIC:
//	                        System.out.print(cell.getNumericCellValue());
//	                        break;
//	                }
//	                System.out.print(" - ");
//	            }
//	            System.out.println();
//	        }
//	         */
//	        workbook.close();
//	        inputStream.close();

	}
	
	
}
