package arrayofstring;

import java.util.Arrays;

public class EachWordReplaceInArrayOfString {

	public static void main(String[] args)
	{
		char ch[]= {'a','B','C','D','e','F','g','H'};
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'  && ch[i]<='Z')
			{
			ch[i]=(char)(ch[i]+32);
			
		}
		
		
			else if(ch[i]>='a'  && ch[i]<='z')
			{
			ch[i]=(char)(ch[i]-32);
			
		}


	}
		System.out.println(Arrays.toString(ch));
	}
}
