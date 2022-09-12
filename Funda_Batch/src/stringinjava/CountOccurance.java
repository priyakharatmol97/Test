package stringinjava;

public class CountOccurance {

	public static void main(String[] args) 
	{
		String s="Java is a programming language";
		int count=0;
		

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		
		System.out.println("The Character 'a' is:"+"\n"+count);
		//System.out.println("substring"+s.substring(1, 3));
		//System.out.println("CSearch from index:"+s.indexOf('a'));
		//System.out.println(index);
		
 
	}

}
