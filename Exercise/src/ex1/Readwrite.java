package ex1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Readwrite {
	
	
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\1548395447943Role+.xlsx.xls");
		Workbook wk=Workbook.getWorkbook(f);
		
		File f1= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\ree.xls");
	    WritableWorkbook ww=Workbook.createWorkbook(f1);
	    WritableSheet ws1=ww.createSheet("r", 0);
		
		
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		{
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
				Cell c1=ws.getCell(j, i);
				System.out.println(c1.getContents());
                Label label = new Label(j,i,c1.getContents());
                ws1.addCell(label);
			
				}
			}ww.write();
	    	ww.close();
		}
	}  
}


	