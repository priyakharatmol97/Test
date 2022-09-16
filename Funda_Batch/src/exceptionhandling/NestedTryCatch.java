package exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,50,10,45,67};
		
		String s=null;
		
		int a=100,b=0;
		
		try
		{
			try 
			{
				try 
				{
					System.out.println("Division is:"+(a/b));
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
				System.out.println("Element at index:"+arr[4]);	
			
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		System.out.println("Done");
	}
}
		
		

	


