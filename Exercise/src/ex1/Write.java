package ex1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\ree.xls");
	    WritableWorkbook ww=Workbook.createWorkbook(f);
	    WritableSheet ws=ww.createSheet("r", 0);
	    
	    for(int i=0; i<=5; i++)
	    	
	    {
	    	for(int j=0; j<=5; j++)
	    	{
	    		Label a=new Label(j,i,"r");
	    		ws.addCell(a);
	    		
	    	}}
	    	ww.write();
	    	ww.close();
	    	
	    }
	}


