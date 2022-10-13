package wrapperclass;

public class ConstructorWrapper {

	public static void main(String[] args) 
	{
		Integer i=new Integer(30); //number
		Integer t=new Integer("60"); //String as a number 2 Integre
		
		Character ch=new Character('d');//1 character
		
		Float f1=new Float(4.5); //float
		Float f2=new Float("4.5"); //String
		Float f3=new Float(4.5);  //double  //Float 3
		
		String s="90"; 
		int a=Integer.parseInt(s);  //String convert Integer
		float f=Float.parseFloat(s);
		double d=Double.parseDouble(s);
		
		Integer h=Integer.valueOf(40);
		System.out.println(h);
		Integer h1=Integer.valueOf("70");
		System.out.println(h1);
		Integer h2=Integer.valueOf("10101", 2);
		System.out.println(h2);
		Integer h3=Integer.valueOf("10103", 4);
		System.out.println(h3);
		Integer h4=Integer.valueOf("10105", 6);
		System.out.println(h4);
		Integer h5=Integer.valueOf("10107", 8);
		System.out.println(h5);
		Integer h6=Integer.valueOf("10115", 16);
		System.out.println(h6);
		
		
		

	}

}
