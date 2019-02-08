package ex1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Userinput {
	
	
	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		
		     File f= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\reena.xls");
			    WritableWorkbook ww=Workbook.createWorkbook(f);
			    WritableSheet ws=ww.createSheet("r", 0);
			    Scanner s=new Scanner(System.in);
				{
			
			    
			    for(int i=0; i<=5; i++)
			    {
			    	
			    {
			    	for(int j=0; j<=5; j++)
			    	{
			    		Scanner se=new Scanner(System.in);
				    	
						System.out.println("Enter data");
						     String a=se.next();
						     {
			    	Label l=new Label(j,i,a);
			    	ws.addCell(l);
			    		
			    	}}
			    	ww.write();
			    	ww.close();
			    	
			    }
			
	}


}}}