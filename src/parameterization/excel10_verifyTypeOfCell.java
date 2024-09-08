package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class excel10_verifyTypeOfCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		Cell celInfo = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(2);

		CellType ActTypeOfCell = celInfo.getCellType();
		System.out.println(ActTypeOfCell);
		

		if (ActTypeOfCell == CellType.STRING) 
		{
			System.out.println(celInfo.getStringCellValue());
		} 
		else if (ActTypeOfCell == CellType.NUMERIC) 
		{
			System.out.println(celInfo.getNumericCellValue());
		} 
		//else (ActTypeOfCell == CellType.BOOLEAN)
		else
		{
			System.out.println(celInfo.getBooleanCellValue());
		}

	}
}