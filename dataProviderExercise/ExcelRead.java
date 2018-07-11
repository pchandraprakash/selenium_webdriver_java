package com.crm.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	//step 1: create a apache poi workbook object
	static Workbook book;
	//step 2: create a apache poi sheet object
	static Sheet sheet;
	//step 3: create string variable to store the excel sheet location
	public static String TESTDATA_SHEET_PATH = "F:\\Udemy_Selenium\\SeleniumWebDriver\\"
			+ "guiAutomation\\src\\main\\java\\com\\crm\\qa\\testdata\\login.xlsx";

	//step 4: create a method which will return 2D Array object
	public static Object[][] getTestData(String sheetName) {
		//step 5: create and initialize a FileInputStream object to null value;
		FileInputStream file = null;
		//step 6: inside try block initialize the FileInputStream object to open the excel sheet by specifying the excel sheet path
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//step 7: initialize the book object and pass the excel sheet which we accessed in previous step
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			e.printStackTrace();
		}
		//step 8: initialize the sheet object and pass the workbook details to access rows/columns of the individual sheet
		sheet = book.getSheet(sheetName);
		//step 9: create a 2D Object array and give the size by specifying the number of rows and column
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int row = 0; row < sheet.getLastRowNum(); row++) {
			for (int column = 0; column < sheet.getRow(0).getLastCellNum(); column++) {
				data[row][column] = sheet.getRow(row + 1).getCell(column).toString();
			}
		}
		return data;
	}
}
