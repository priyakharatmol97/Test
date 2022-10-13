package enuminjava;

public enum BookMyShow implements TicketRate
{
	GOLDEN(150)
	{
		public void description()
		{
			System.out.println("Rate of Gold are Rs 150 per Person");
		}
	}
	,SILVER(200)
	{
		public void description()
		{
			System.out.println("Rate of Silver are Rs 200 per Person");
		}
	}
	,PLATINUM(250)
	{
		public void description()
		{
			System.out.println("Rate of Platinum are Rs 250 per Person");
		}
	};
	int rate;
	
	BookMyShow(int val)
	{
		rate=val;
	}
	
	void display()
	{
		System.out.println("Book Your Tickets from the app/website");
	}
	/*public void description()
	{
		System.out.println("Rate are affordable");
	}*/

}
