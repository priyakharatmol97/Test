package assignment4;

public class AddressConstructor 
{
	String city,state,country;
	PersonConstructor p;
	
	AddressConstructor (String city,String state,String country,PersonConstructor p)
	{
		this.city=city;
		this.state=state;
		this.country=country;
		this.p=p;
	}
	
	public String toString()
	{
		return city+" "+state+" "+country+" "+p;
	}

}
