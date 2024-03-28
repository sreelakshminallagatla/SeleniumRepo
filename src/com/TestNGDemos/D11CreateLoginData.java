package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11CreateLoginData {
	String fPath = "C:\\Users\\sreel\\OneDrive\\Documents\\StarAgile\\ExcelFile\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;
	
	@Test(dataProvider = "getLoginDetails")
	public void writeToLoginFile(String un, String ps, String rs) {
		row = sheet.createRow(index);
		
		cell = row.createCell(0);
		cell.setCellValue(un);
		
		cell = row.createCell(1);
		cell.setCellValue(ps);
		
		cell = row.createCell(2);
		cell.setCellValue(rs);
		
		index++;
	}

	@DataProvider
	public Object[][] getLoginDetails() {
		return new Object[][] {
			new Object[] { "User Name", "Password", "Result" },
			new Object[] { "admin", "admin123", "Not Run" },
			new Object[] { "Mrunali", "mrunali123", "Not Run" },
			new Object[] { "Nikhil", "nikhil123", "Not Run" },
			new Object[] { "admin", "admin123", "Not Run" },
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet= wb.createSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}