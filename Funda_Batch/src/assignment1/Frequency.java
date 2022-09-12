package assignment1;

public class Frequency {

	public static void main(String[] args)
	{
		int num=1012010;
		int temp=num;
		
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			while(temp!=0)
			{
				int r=temp%10;
				
				if(r==i)
				{
					cnt++;
				}
				temp=temp/10;
			}
			if(cnt>0)
			{
				System.out.println(i+""+cnt);
			}
		}
		

	}

}
