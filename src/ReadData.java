import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) {
		//specify the path of an excel file
		String filePath="data.xlsx";
		
		try {
			
			FileInputStream inpstream=new FileInputStream(filePath);
			XSSFWorkbook workbook =new XSSFWorkbook(inpstream);
			
			//Get an acess to sheet of the workbook
			Sheet sheet=workbook.getSheetAt(0);
			
			
			//iterate over the row in sheet
			for(Row row:sheet) {
				//iterate over the cell of each row
				for(Cell cell:row) {
//					to check if cell contains is string or numeric
					if(cell.getCellType()==CellType.STRING) {
						System.out.print(cell.getStringCellValue()+"\t");
					}else if (cell.getCellType()==CellType.NUMERIC) {
						System.out.print(cell.getNumericCellValue()+"\t");
					}
					
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	

	}	

}
