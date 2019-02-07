package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMethod {

	
	public void write() throws IOException
	{
		File f=new File("C:\\Users\\lenovo\\Desktop\\new.txt");
		FileWriter fw=new FileWriter(f);
		 BufferedWriter bw=new BufferedWriter(fw);
		 bw.write("class");
	     bw.newLine();
	     bw.write("jkl");
	     
	  
	     bw.close();
		
	}
		
	
	
public static void main(String[] args) throws IOException {
	WriteMethod obj=new WriteMethod();
	obj.write();
	

}
}


