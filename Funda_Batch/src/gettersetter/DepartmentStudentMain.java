package gettersetter;

public class DepartmentStudentMain {

	public static void main(String[] args)
	{
		Student s=new Student();
		//s.setId(101);
		s.setName("Priya");
		s.setMarks(80);
		
		Student s2=new Student();
		//s.setId(101);
		s2.setName("Diya");
		s2.setMarks(70);
		
		Student s3=new Student();
		//s.setId(101);
		s3.setName("Riya");
		s3.setMarks(60);
		
		Student s4=new Student();
		//s.setId(101);
		s4.setName("Nayan");
		s4.setMarks(50);
		
		Student s5=new Student();
		//s.setId(101);
		s5.setName("Najuka");
		s5.setMarks(40);
		
		
		
		Department d2=new Department();
		//d.setId(102);
		//d.setName("Ram");
		d2.setNumOfStudent(15);
		d2.setHeadOfDepartment("Mechanical");
		d2.setStudent(s);
		
		Department d3=new Department();
		//d.setId(102);
		//d.setName("Ram");
		d3.setNumOfStudent(20);
		d3.setHeadOfDepartment("Civil");
		d3.setStudent(s);
		
		Department d4=new Department();
		//d.setId(102);
		//d.setName("Ram");
		d4.setNumOfStudent(25);
		d4.setHeadOfDepartment("IT");
		d4.setStudent(s);
		
		
		Department d=new Department();
		//d.setId(102);
		//d.setName("Ram");
		d.setNumOfStudent(5);
		d.setHeadOfDepartment("Computer");
		d.setStudent(s);
		
		
		Department d1=new Department();
		//d.setId(102);
		//d.setName("Ram");
		d1.setNumOfStudent(10);
		d1.setHeadOfDepartment("Electrical");
		d1.setStudent(s);
		
		
		
		
		//System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		//System.out.println(d.getId()+" "+d.getName()+" "+d.getNumOfStudent()+" "+d.getHeadOfDepartment()+" "+d.getStudent());
		
		System.out.println(s.getName()+" "+d.getHeadOfDepartment()+" "+d.getNumOfStudent()+" "+s.getMarks());
		System.out.println(s2.getName()+" "+d1.getHeadOfDepartment()+" "+d1.getNumOfStudent()+" "+s2.getMarks());
		System.out.println(s3.getName()+" "+d2.getHeadOfDepartment()+" "+d2.getNumOfStudent()+" "+s3.getMarks());
		System.out.println(s4.getName()+" "+d3.getHeadOfDepartment()+" "+d3.getNumOfStudent()+" "+s4.getMarks());
		System.out.println(s5.getName()+" "+d4.getHeadOfDepartment()+" "+d4.getNumOfStudent()+" "+s5.getMarks());
		
		

	}

}
