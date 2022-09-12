package assignment4;

public class PersonConstructor 
{
	int age;
	String name,gender,address;
	
	PersonConstructor(int age,String name,String gender,String address)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.address=address;
	}
	public String toString()
	{
		return age+" "+name+" "+gender+" "+address;
	}

}
