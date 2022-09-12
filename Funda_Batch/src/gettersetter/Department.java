package gettersetter;

public class Department 
{
	int id,numOfStudent;
	String name,headOfDepartment;
	
	Student s;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setNumOfStudent(int numOfStudent)
	{
		this.numOfStudent=numOfStudent;
	}
	public int getNumOfStudent()
	{
		return numOfStudent;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setHeadOfDepartment(String headOfDepartment)
	{
		this.headOfDepartment=headOfDepartment;
	}
	public String getHeadOfDepartment()
	{
		return headOfDepartment;
	}
	
	public void setStudent(Student s)
	{
		this.s=s;
	}
	public Student getStudent()
	{
		return s;
	}
	

}
