package stringinjava;

public class StringAddNumericValue {

	public static void main(String[] args) 
	{
		String s="THE SKY IS THE LIMIT";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			int sum=0;
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				sum=sum+(ch[j]-64);
			}
			System.out.println(str[i]+" "+sum);
		}

	}

}
