package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {

	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider = "driveTest")
	public void test(String email, String password, String text) {
		System.out.println(email+" "+password+" "+text);
	}

	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//excelFiles//creds.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0); // ---To get the total colums from Title row
		int colCount = row.getLastCellNum();

		Object data[][] = new Object[rowCount - 1][colCount]; //----creating row(title row no included) and column

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
//				System.out.println(i+1 + " " + j);
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell); // ---Converting all data to String
			}
		}
		return data;
	}
}
