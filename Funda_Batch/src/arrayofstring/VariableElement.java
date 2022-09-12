package arrayofstring;

public class VariableElement 
{
	static void add(String s,int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is:"+sum);
	}
	
	static void add(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is:"+sum);
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		add(arr);
		add(20,40,60);
		add(2,4,6,8,10);
		

	}

}
