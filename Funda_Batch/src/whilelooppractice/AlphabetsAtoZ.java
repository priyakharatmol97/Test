package whilelooppractice;

public class AlphabetsAtoZ {

	public static void main(String[] args) 
	{
		char character='a';
		System.out.println("Alphabtes");
		System.out.println();
		
		while(character<='z')
		{
			System.out.print(character+" ");
			character++;
		}

	}

}
