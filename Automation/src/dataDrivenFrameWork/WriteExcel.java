package dataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestDataToRead.xlsx");//take the file for reading
		Workbook wb = WorkbookFactory.create(fis);// make it ready to read
		Sheet sh = wb.getSheet("Credentials");// specify the sheet in which we need to add the data
		Row row = sh.getRow(0);// specify the row in which we need to write the data
		Cell cell = row.createCell(2);// this method is used to make the cell ready to write
		cell.setCellValue("status");// data will be set by this method which accepts string arg
		FileOutputStream fos = new FileOutputStream("./data/TestDataToRead.xlsx");// writing operation will be done by FileOutputStream
        wb.write(fos);// write the data to the file
        
		}
		
	
	}
	


