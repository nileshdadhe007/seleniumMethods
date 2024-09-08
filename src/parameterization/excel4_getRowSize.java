package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel4_getRowSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		int lastRowIndex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(lastRowIndex+1);
	}
}