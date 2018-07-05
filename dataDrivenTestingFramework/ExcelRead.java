package dataDrivenTestingFramework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		// step 1: declare excel workbook, worksheet and cell objects
		XSSFWorkbook excelWorkbook;
		XSSFSheet excelWorkSheet;
		XSSFCell cell;

		// step 2: Location of the excel data sheet
		String path = "F:\\Udemy_Selenium\\SeleniumWebDriver\\SeleniumWebDriver\\excelData\\excelRead.xlsx";
		String sheetName = "Sheet1";

		try {
			// step 3: File input stream object to read the data from excel sheet
			FileInputStream excelFile = new FileInputStream(path);
			// step 4: initialize the workbook and pass the FIS object as an argument
			excelWorkbook = new XSSFWorkbook(excelFile);
			// step 5: access the worksheet from workbook by specifying the sheet name
			excelWorkSheet = excelWorkbook.getSheet(sheetName);
			// step 6: from excel work sheet access data in specific row and column
			cell = excelWorkSheet.getRow(1).getCell(0);
			// step 7: store the cell data in a string variable and print it
			String cellData = cell.getStringCellValue();
			System.out.println("print cell data: " + cellData);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
