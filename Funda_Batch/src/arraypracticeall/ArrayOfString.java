package arraypracticeall;

public class ArrayOfString {

	public static void main(String[] args) 
	{
		String s[]= {"java","is","programming","language"};
		System.out.println("Length of array String is:");
		/*for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"-"+s[i].length());
		}*/
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]+"-"+s[i].length());
		}

	}

}
