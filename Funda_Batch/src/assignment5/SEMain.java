package assignment5;

public class SEMain {

	public static void main(String[] args) 
	{
		Exam e=new Exam();
		e.setRollNo(10);
		e.setName("Priya");
		e.setSubName("Java");
		
		System.out.println(e.getRollNo()+" "+e.getName()+" "+e.getSubName());
		

	}

}
