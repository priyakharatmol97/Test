package Day4;

public class Ternary {

	public static void main(String[] args) 
	{
		int a=100,b=200,c=300;
		
		String ans=(a>b && a>c) ?a+"is greater" :b>a && b>c ? b+"is greater":c+"is greater";
		System.out.println(ans);
		
	}

}
