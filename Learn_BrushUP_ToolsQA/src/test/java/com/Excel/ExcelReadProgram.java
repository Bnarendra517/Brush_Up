package com.Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReadProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hiiii");
		//creating an instance of Workbook class   
		Workbook wb = new HSSFWorkbook();   
		//creates an excel file at the specified location  
		OutputStream fileOut = new FileOutputStream("C:\\Users\\narendrab\\git\\BrushUp_Automation\\Learn_BrushUP_ToolsQA\\ExcelData\\CreateExcel.xlsx");   
		System.out.println("Excel File has been created successfully.");   
		wb.write(fileOut);  
		
	}

}
