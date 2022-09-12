package assignment4;

public class PersonAddressMain {

	public static void main(String[] args) 
	{
		Person p=new Person();
		p.setAge(23);
		p.setName("Priya");
		p.setGender("F");
		p.setAddress("Airoli");
		
		Person p2=new Person();
		p2.setAge(22);
		p2.setName("Nayan");
		p2.setGender("M");
		p2.setAddress("Rabale");
		
		Person p3=new Person();
		p3.setAge(30);
		p3.setName("Najuka");
		p3.setGender("F");
		p3.setAddress("Ghansoli");
		
		Person p4=new Person();
		p4.setAge(28);
		p4.setName("Anand");
		p4.setGender("M");
		p4.setAddress("Kalyan");

		
		Person p5=new Person();
		p5.setAge(23);
		p5.setName("Vidya");
		p5.setGender("F");
		p5.setAddress("Katraj");
		
		Address a=new Address();
		a.setCity("Thane");
		a.setState("Maharashtra");
		a.setCountry("India");
		
		Address a2=new Address();
		a2.setCity("Navi Mumbai");
		a2.setState("Maharashtra");
		a2.setCountry("India");
				
		Address a3=new Address();
		a3.setCity("Pune");
		a3.setState("Maharashtra");
		a3.setCountry("India");
				
		Address a4=new Address();
		a4.setCity("Tokyo");
		a4.setState("Japan");
		a4.setCountry("India");
				
		
		Address a5=new Address();
		a5.setCity("New Delhi");
		a5.setState("Maharashtra");
		a5.setCountry("India");
		
		
		System.out.println(p.getAge()+" "+p.getName()+" "+p.getGender()+" "+p.getAddress());
		System.out.println(p2.getAge()+" "+p2.getName()+" "+p2.getGender()+" "+p2.getAddress());
		System.out.println(p3.getAge()+" "+p3.getName()+" "+p3.getGender()+" "+p3.getAddress());
		System.out.println(p4.getAge()+" "+p4.getName()+" "+p4.getGender()+" "+p4.getAddress());
		System.out.println(p5.getAge()+" "+p5.getName()+" "+p5.getGender()+" "+p5.getAddress());
		
				
				


	}

}
