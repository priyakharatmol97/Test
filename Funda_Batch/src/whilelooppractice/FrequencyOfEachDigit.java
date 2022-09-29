package whilelooppractice;

import java.util.Scanner;

public class FrequencyOfEachDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int cnt,digit,temp;
		
		//System.out.println("Frequency Of Digit");
		for(int i=0;i<=num;i++)
		{
			cnt=0;
			temp=num;
			while(temp>0)
			{
				digit=temp%10;
				if(digit==i)
				{
					cnt++;
				}
				temp=temp/10;
			}
			if(cnt>0)
			{
				System.out.println(i+" "+cnt);
			}
		}

	}

}
