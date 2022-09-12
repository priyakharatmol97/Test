package overriding;

public class Employee extends Person
{
	int id;
	String name,contact,address;
	
	void setEmployeeData(int id,String name,String contact,String address)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.address=address;
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+name+" "+contact+" "+address);
	}
	
	public Person display2()
	{
		System.out.println("Inside Employee Class");
		return new Person();
	}
	
	

}
