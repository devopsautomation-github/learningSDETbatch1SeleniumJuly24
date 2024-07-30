package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//index
//		HSSFSheet Sheet = workbook.getSheetAt(0);
		
		//name
		HSSFSheet Sheet = workbook.getSheet("smokeTest");
		
		
		
		
		//rows
		int rowCount = Sheet.getLastRowNum();
		int columnCount = Sheet.getRow(0).getLastCellNum();
		
		
		
		System.out.println("Rows count are: " + rowCount);
		System.out.println("column count are: " + columnCount);
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			String firstName = Sheet.getRow(i).getCell(0).toString();
			String address = Sheet.getRow(i).getCell(4).toString();
			
			System.out.println("First Name: " + firstName + ", address details are: " + address);
			System.out.println("==================================================================");
		}
		
		
		

	}

}
