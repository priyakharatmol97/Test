package Inheritance;

public class DepartmentStudentMain {

	public static void main(String[] args) 
	{
		Student s=new Student(1,"Priya",90);
		Student s2=new Student(2,"Nayan",80);
		Student s3=new Student(3,"Riya",70);
		Student s4=new Student(4,"Navya",60);
		Student s5=new Student(5,"Anand",50);
		
		Department d=new Department(101,"Computer",40,"Kashid Sir",s);
		Department d2=new Department(102,"Mechanical",60,"Javend Sir",s2);
		Department d3=new Department(103,"Electrical",30,"Raksha Maam",s3);
		Department d4=new Department(104,"Civil",80,"Vaishali Maam",s4);
		Department d5=new Department(105,"IT",70,"Dinesh Sir",s5);
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		

	}

}
