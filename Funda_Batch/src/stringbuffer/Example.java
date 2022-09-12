package stringbuffer;

public class Example {

	public static void main(String[] args) 
	{
		String s=new String("Java");
		s.concat("Core");
		System.out.println(s);
		
		StringBuffer sbf=new StringBuffer("Java"); //16+4
		sbf.ensureCapacity(50);
		
		System.out.println(sbf.capacity());//character
		System.out.println(sbf.length());//length
		sbf.append("Core");
		System.out.println(sbf);
		
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		System.out.println(sbf.reverse());
		System.out.println(sbf.replace(2, 6, "!!!"));
		
		sbf.deleteCharAt(3);
		System.out.println(sbf);
		sbf.delete(2, 5);
		System.out.println(sbf);

	}

}
