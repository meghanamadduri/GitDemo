import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	
	public ArrayList<String> getData(String testcaseName)
	{
		ArrayList<String> a=new ArrayList<String>();

		FileInputStream fis=new FileInputStream("C:\\Users\\megha\\OneDrive\\Documents\\Demodata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Testcase"));
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
		
			}
		Iterator<Row> row= sheet.iterator();// sheet is a collection of row
		Row firstrow=row.next();
	Iterator<Cell> cell=firstrow.cellIterator();// row is collection of cell
	while(cell.hasNext())
	{
		Cell ce=cell.next();
		if(ce.getStringCellValue().equalsIgnoreCase("TestcaseName"));
		int k=0;
		int column=0;
	    k++;
	    column=k;
		}
	while (row.hasNext())
	{
	Row rv=row.next();	
	Iterator<Cell> c=rv.cellIterator();
	while(c.hasNext())
	{
		Cell cv=c.next();
		if(cv.getCellTypeEnum()==CellType.STRING)
		{		
		a.add(c.next().getStringCellValue());
		}
		else
		{
		c.
		}
		}
	}
	}
	return a;
		
    
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	}
		


