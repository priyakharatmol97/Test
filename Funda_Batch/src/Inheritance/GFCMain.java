package Inheritance;

public class GFCMain {

	public static void main(String[] args)
	{
		Child c=new Child();
		c.setGrandFatherData("Laxman", "Bhaskar", "Shinge");
		c.setFatherData("Nayan");
		c.setChildData("Priya");
	
		c.display();
		
		

	}

}
