package stringinjava;

public class Class1 {

	public static void main(String[] args) 
	{
		String str=new String("Hello");
		System.out.println("String str before concate:"+str);
		
		String str1=str.concat("World");
		System.out.println("String str after concate:"+str);
		System.out.println("String str1:"+str1);
		
		String s1="Good";
		String s2="Luck";
		String s3=s1+s2;
		System.out.println("String s1:"+s1);
		System.out.println("String s2:"+s2);
		System.out.println("String s3:"+s3);

	}

}
