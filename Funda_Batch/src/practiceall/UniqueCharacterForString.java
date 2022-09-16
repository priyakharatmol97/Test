package practiceall;

import java.util.Arrays;

public class UniqueCharacterForString {

	public static void main(String[] args) 
	{
		String s="Programming";
		char ch[]=s.toCharArray();
		
        int len=ch.length;
        int a=ch.length;
		
		int c1[]=new int[len];
		System.out.println(Arrays.toString(ch));
		
		
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.print(ch[i]);
			}
		}

	

	}

}
