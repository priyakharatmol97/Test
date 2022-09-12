package arrayofstring;

public class ArrayString {

	public static void main(String[] args)
    {
		String arr[]= {"Java","Is","Good","Language"};
		
		System.out.println("Length of Array String");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"-"+arr[i].length());
		}
		System.out.println();
		
		
		System.out.println("Reverse the length of Array String");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"-"+arr[i].length());
		}
		System.out.println();
		

	}

}
