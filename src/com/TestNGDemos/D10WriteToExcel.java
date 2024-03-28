package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D10WriteToExcel {
  String fPath = "C:\\Users\\sreel\\OneDrive\\Documents\\StarAgile\\ExcelFile\\MyFirstExcel.xlsx";
  File file;
  FileOutputStream fos;
  XSSFWorkbook wb;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  
	
  @Test
  public void writeToExcel() {
	  //Create any row once only
	  
	  row =sheet.createRow(0);   //Create 1st row as index starts with 0
	  cell=row.createCell(0);    //Creates first cell in first row
	  
	  cell.setCellValue("Shubham");
	  
	  //row =sheet.createRow(0);
	  cell= row.createCell(1);
	  cell.setCellValue("Ranjan");
	  
	  //row =sheet.createRow(0);
	  cell= row.createCell(2);
	  cell.setCellValue("Manvith");
	  
	  //row =sheet.createRow(0);
	  cell= row.createCell(3);
	  cell.setCellValue("Nishanth");
	  
	  row =sheet.createRow(1);   //Create 1st row as index starts with 0
	  cell=row.createCell(0);    //Creates first cell in first row
	  
	  cell.setCellValue("Sushant");

	  
  }

  @BeforeTest
  public void beforeTest()throws FileNotFoundException {
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Test Sheet");
	  
  }
  @AfterTest
  public void afterTest() throws IOException {
	  	wb.write(fos);
	  	wb.close();
	  	fos.close();
	  		
  }
}
