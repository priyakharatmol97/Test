package enuminjava;

public class BookMyShowMain {

	public static void main(String[] args) 
	{
		BookMyShow b1=BookMyShow.GOLDEN;
		BookMyShow b2=BookMyShow.SILVER;
		BookMyShow b3=BookMyShow.PLATINUM;
		
		b1.description();
		b2.description();
		b3.description();
		
		b1.display();
	}

}
