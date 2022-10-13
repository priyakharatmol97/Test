package xyz;

public class StudentEncapsulationMain {

	public static void main(String[] args) 
	{
		StudentEncapsultion s=new StudentEncapsultion();
		s.setId(1);
		s.setAge(23);
		s.setSalary(20000);
		s.setName("Priya");
		s.setDept("Computer");
		
		System.out.println(s.getId()+" "+s.getAge()+" "+s.getSalary()+" "+s.getName()+" "+s.getDept());

	}

}
