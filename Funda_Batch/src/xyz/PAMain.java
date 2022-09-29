package xyz;

public class PAMain {

	public static void main(String[] args) 
	{
		Address a1=new Address();
		a1.setStreet("Airoli");
		a1.setCity("Thane");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Priya");
		p1.setContact("7977956202");
		p1.setAge(24);
		p1.setA(a1);
		
		System.out.println(a1.getStreet()+" "+a1.getCity()+" "+a1.getState()+" "+a1.getCountry());
		
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getContact()+" "+p1.getAge()+" "+p1.getA());
		

	}

}
