package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel12_printAllTypeDataInSheet_usingLocalMethod {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		Sheet sh4 = WorkbookFactory.create(file).getSheet("Sheet4");

		int lastRowIndex = sh4.getLastRowNum();

		for (int i = 0; i <= lastRowIndex; i++) {
			int lastCellIndex = sh4.getRow(i).getLastCellNum() - 1;
			for (int j = 0; j <= lastCellIndex; j++) {
				Cell cellInfo = sh4.getRow(i).getCell(j);
				Object info = getCellInfoByVerifyingItsCellType(cellInfo);
				System.out.print(info+ " ");
			}
			System.out.println();
		}
	}

	public static Object getCellInfoByVerifyingItsCellType(Cell cellInfo) {
		CellType actTypeOfCell = cellInfo.getCellType();
		Object value=null;

		if (actTypeOfCell == CellType.STRING) 
		{
			 value = cellInfo.getStringCellValue();
		}
		else if (actTypeOfCell == CellType.NUMERIC) 
		{
			 value = cellInfo.getNumericCellValue();
		}
		else if (actTypeOfCell == CellType.BOOLEAN) 
		{
			 value = cellInfo.getBooleanCellValue();
		}

		
		return value;

	}

}