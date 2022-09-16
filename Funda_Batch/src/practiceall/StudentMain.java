package practiceall;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student s=new Student();
		
		s.setId(101);
		s.setName("Priya");
		s.setDept("Computer");
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getDept());

	}

}
