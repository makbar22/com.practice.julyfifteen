package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String pathToExcelFile = ".\\src\\test\\resources\\inputData\\CreateAccountData.xlsx";

	public static Workbook book; // two class that is provide by apache poi that help us read data from worksheet
	public static Sheet sheet;

	public static Object[][] getExcelData(String sheetName) {
		try {
			FileInputStream file = new FileInputStream(pathToExcelFile);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);

			// this line of code will read all values in excel till last row and last column
			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheet.getLastRowNum(); i++) { // loop through rows
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) { // loop through column

					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

				}
			}
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}
