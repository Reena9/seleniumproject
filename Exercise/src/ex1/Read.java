package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Read {
	
	
		
        
		
		
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\Desktop\\r.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		FileWriter fw=new FileWriter("C:\\Users\\lenovo\\Desktop\\new.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
	
		
		String s;
		while((s=b.readLine())!=null)
		{
			
			fw.write(s);
			fw.flush();
			
	}
		b.close();
		fw.close();
	
	
	
}}

