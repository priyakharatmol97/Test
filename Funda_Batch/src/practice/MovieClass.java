package practice;

public class MovieClass 
{
	
	int yearOfRelease;     //properties
	float profit;
	String producer,actor;
	
	void acceptDetails()  //behaviour
	{
		yearOfRelease=1997;
		profit = 12000.80f;
		producer = "Mrs James";
		actor="Vicky Kaushalya";				
	}
	
	void showDetails()  //behaviour
	{
		System.out.println("The Movie yearofrelease is:"+yearOfRelease);
		System.out.println("The Movie profit is:"+profit);
		System.out.println("The Movie producer name is:"+producer);
		System.out.println("The Movie actor name is:"+actor);
	}
	public static void main(String args[])
	{
		MovieClass titanic=new MovieClass();
		titanic.acceptDetails();
		titanic.showDetails();
		
				
	}

}


