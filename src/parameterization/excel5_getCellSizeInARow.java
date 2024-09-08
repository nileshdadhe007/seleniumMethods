package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel5_getCellSizeInARow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(colSize);
	
	
	}
}