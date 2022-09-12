package assignment4;

import gettersetter.Student;

public class Address
{
	String city,state,country;
	Person p;
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	
	
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCountry()
	{
		return country;
	}
	
	public void setPerson(Person p)
	{
		this.p=p;
	}
	public Person getPerson()
	{
		return p;
	}
	
	
	public String toString()
	{
		return city+" "+state+" "+country+" "+p;
	}

}
