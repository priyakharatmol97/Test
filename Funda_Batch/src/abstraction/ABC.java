package abstraction;

public class ABC extends ABCMainBranch implements Transport,College
{
	public void departments()
	{
		System.out.println("There are 4 Departments");
	}
	
	public void classRooms()
	{
		System.out.println("There are Total 10 classRooms");
	}
	
	public void library()
	{
		System.out.println("Only 1 Library");
	}
	
	public void laboratory()
	{
		System.out.println("There are 3 Laboratory");
	}
	
	public void canteen()
	{
		System.out.println("Only 1 Canteen");
	}
	
	public void transport()
	{
		System.out.println("Ananya Transport Will be Available");
	}

	@Override
	public void transportFacility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		
	}

}
