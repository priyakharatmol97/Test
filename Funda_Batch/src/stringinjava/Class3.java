package stringinjava;

public class Class3 {

	public static void main(String[] args) 
	{
		String str1=new String("HelloWorld");
		String str2=new String("helloworld");
		//indexOf
		System.out.println("indexOf given character:"+str1.indexOf('l'));
		System.out.println("indexOf given string:"+str1.indexOf("Wor"));
		
		//compareTo
		
		if(str1.compareTo(str2)==0)
			System.out.println("Strings are Equal");
		else if(str1.compareTo(str2)<0)
			System.out.println("str1 is less than str2");
		else if(str1.compareTo(str2)>0)
			System.out.println("str1 is greater than str2");
		
		
		//subString(startidx,endidx)
		
		System.out.println("substring"+str1.substring(2, 6));
		
		//lastIndexOf
		
		System.out.println("Last index of 'l':"+str1.lastIndexOf('l'));
		
		//firstIndexOf
		
		System.out.println("First index of :"+str1.startsWith(str2));
		

	}

}
