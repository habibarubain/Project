package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	@DataProvider(name = "testdata")
	public Object[][] Reading(String filePath,String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{
		File excel=new File(filePath);
		Workbook workbook = WorkbookFactory.create(excel);
		Sheet sheet = workbook.getSheet(SheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++) {
			Row actualrow = sheet.getRow(row);
			for(int cell=0;cell<actualrow.getLastCellNum();cell++) {
				data[row][cell]=actualrow.getCell(cell).toString();
			}
		} 
		return data;
	}

}
