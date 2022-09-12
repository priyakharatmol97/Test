package abstraction;

public class FunctionalExample {

	public static void main(String[] args) 
	{
	  FunctionalEx fx=()->System.out.println("Display the FunctionalEx");
	  fx.function();
	
	   Addition add=(a,b)-> System.out.println("Addition is : "+(a+b));
	   add.add(10, 20);
		}

	}


	


