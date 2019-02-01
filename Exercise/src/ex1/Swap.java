package ex1;

public class Swap {

	public void num()
	{
		int a=50;
		int b=20;
		b=(a+b)-b;
		
		System.out.println("value of b "+b);
		System.out.println("value of a "+a);
	
	}public static void main(String[] args) {
		Swap obj=new Swap();
				obj.num();
	}
}
