package practiceall;

import java.util.Arrays;

public class DeleteduplicateNumber {

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6};
		int b1[]= {4,5,6,7,8,9};
		
		int len=a1.length+b1.length;
		
		int c1[]=new int[len];
		
		for(int i=0;i<a1.length;i++)
		{
			c1[i]=a1[i];
		}
		
		int a=a1.length;
		
		for(int i=0;i<b1.length;i++)
		{
			c1[a+i]=b1[i];
		}
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			int cnt=0;
			for(int j=0;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(c1[i]);
			}
		}

	

	}

}
