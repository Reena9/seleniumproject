package ex1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number=s.nextInt();
	   int c=0; 
	int temp=number;
	   int a;
	   while(number>0)
	   {
		   a=number%10;
		   number=number/10;
		   c=c+(a*a*a);
	   }
	   if(temp==c)
	   System.out.println("Armstrong number");
	   
	   else
	   
		   System.out.println("Not armstrong");
	   }
	}




