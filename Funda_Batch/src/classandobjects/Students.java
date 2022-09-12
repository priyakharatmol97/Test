package classandobjects;

public class Students
{
	void displayName()
	{
		System.out.println("Names Are:");
		System.out.println("1. Priya Ankush Kharatmol");
		System.out.println("2. Vidya Babasaheb Shirole");
		System.out.println("3. Nayan Laxman Shinge");
	}
	
	void bestFriend()
	{
		System.out.println("There are Three BestFriends Forever");
	}
	

	public static void main(String[] args) 
	{
		Students s=new Students();
		s.displayName();
		s.bestFriend();
	}

}
