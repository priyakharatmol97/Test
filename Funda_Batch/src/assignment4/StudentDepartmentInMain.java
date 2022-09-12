package assignment4;

public class StudentDepartmentInMain {

	public static void main(String[] args)
	{
		StudentIn s=new StudentIn(1,"Priya");
		StudentIn s2=new StudentIn(2,"Nayan");
		StudentIn s3=new StudentIn(3,"Riya");
		StudentIn s4=new StudentIn(4,"Anand");
		StudentIn s5=new StudentIn(5,"Najuka");
		
		DepartmentIn d=new DepartmentIn(101,"Computer",s);
		DepartmentIn d2=new DepartmentIn(102,"Mechanical",s2);
		DepartmentIn d3=new DepartmentIn(103,"Electrical",s3);
		DepartmentIn d4=new DepartmentIn(104,"Civil",s4);
		DepartmentIn d5=new DepartmentIn(105,"IT",s5);
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);

	}

}
