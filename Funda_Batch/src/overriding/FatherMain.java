package overriding;

public class FatherMain 
{

	public static void main(String[] args) 
	{
		Father f=new Father();
		f.vehicle();
		
		f=new Son();
		f.vehicle();
		f.house();

		f=new Daughter();
		f.vehicle();
		

	}

}
