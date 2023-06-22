import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCell {

	public static void main(String[] args) {
		String filePath="data.xlsx";
		try {
			FileInputStream inpstr=new FileInputStream(filePath);
			Workbook workbook=new XSSFWorkbook(inpstr);
			//read the data from excel file
			Sheet sheet=workbook.getSheetAt(0);
			Row row=sheet.getRow(1);//read data from second row
			
			Cell cell=row.getCell(0);
			
			if(cell.getCellType()==CellType.STRING) {
				System.out.println("Cell Value :"+ cell.getStringCellValue());
			}else if(cell.getCellType()==CellType.NUMERIC) {
				System.out.println("Cell Value "+cell.getNumericCellValue());
			}
			
			workbook.close();
			inpstr.close();
			
		} catch (IOException e) {
		 e.printStackTrace();
		}

	}

}
