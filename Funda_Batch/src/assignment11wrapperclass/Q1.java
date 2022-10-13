package assignment11wrapperclass;

public class Q1 {

	public static void main(String[] args) 
	{
		String  a="100";
		//Integer b=new Integer(a);
		
		byte bt=Byte.parseByte(a);
		System.out.println(bt);
		
		int i=Integer.parseInt(a);
		System.out.println(i);
		
		short s=Short.parseShort(a);
		System.out.println(s);
		
		float f=Float.parseFloat(a);
		System.out.println(f);
		
		double d=Double.parseDouble(a);
		System.out.println(d);
	}

}
