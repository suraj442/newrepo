package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./data/TestDataToRead.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		// this method is used to make the excel file ready to read
		Sheet sh = wb.getSheet("Credentials");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String dataFromCell = cell.getStringCellValue();
		System.out.println(dataFromCell);
	
	
	
		
	}
}


