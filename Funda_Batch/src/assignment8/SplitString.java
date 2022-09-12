package assignment8;

public class SplitString {

	public static void main(String[] args)
	{
		String s="HELLO:WORLD";
		String[] result=s.split(":");
		
		//System.out.println("result");
		
		for(String str:result)
		{
			System.out.println(str);
		}
		
		
			

	}

}
