package stringinjava;

public class Q4 {

	public static void main(String[] args)
	{
		String s1="Java";
		String s2="Program";
		String s3=new String("Java");
		
		System.out.println("Compare To:"+s1.compareTo(s2));  //compare
		System.out.println("CompareTo IgnoreCase:"+s1.compareToIgnoreCase(s3));
		
		System.out.println(s1==s3);     //==
		
		System.out.println("String length is:"+s1.length());//length
		System.out.println("String length is:"+s2.length());

	}

}
