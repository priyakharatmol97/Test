package practiceall;

public class FSDMain {

	public static void main(String[] args) 
	{
		Father f=new Father();
		f.house();
		f.vehicle();
		f=new Son();
		f.house();
		f.vehicle();
		f=new Daughter();
		f.house();
		f.vehicle();

	}

}
