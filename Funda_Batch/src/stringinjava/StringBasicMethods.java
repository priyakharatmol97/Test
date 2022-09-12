package stringinjava;

public class StringBasicMethods
{

	public static void main(String[] args) 
	{
		String s1="Java";
		String s2="Language";
		String s3="java";
		String s4="Java";
		String s5=new String("Java");
		
		System.out.println(s1==s5);
		
		System.out.println("equals:"+s1.equals(s3));
		
		System.out.println("Equals ignore Case:"+s1.equalsIgnoreCase(s3));
		
		System.out.println("Add Two Strings:"+s1.concat(s2));
		
		System.out.println(s1);
		
		System.out.println("Compare To:"+s1.compareTo(s3)); // s1>s3 +ve, s1<s3 -ve, s1==s3 0
		
		System.out.println("CompareTo IgnoreCase:"+s1.compareToIgnoreCase(s3)); //language
		                                                                        //01234567
		System.out.println("Index of:"+s2.indexOf('a'));
		
		System.out.println("Last index Of:"+s2.lastIndexOf('a'));
		
		System.out.println("Contains:"+s2.contains("gs"));
		
		System.out.println("Replace:"+s2.replace('a', 'A') + " "+s2.replace("age", "AGE"));
		
		System.out.println("CSearch from index:"+s2.indexOf('a', 3));
		
		System.out.println("Substring:"+s2.substring(3));
		
		System.out.println("Substring 2 inputs:"+s2.substring(2, 6));
		
		System.out.println("UpperCase:"+s2.toUpperCase());
		
		System.out.println("LowerCase:"+s2.toLowerCase());
		
		System.out.println("CharAt:"+s2.charAt(5));
		
		System.out.println("Starts with:"+s2.startsWith("l"));
		
		System.out.println("Ends with:"+s2.endsWith("e"));
		
		System.out.println("Length is:"+s2.length());

	}

}
