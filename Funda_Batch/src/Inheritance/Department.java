package Inheritance;

public class Department
{
	int id,numOfStudent;
	String name,headOfDepartment;
	Student s;
	
	Department(int id,String name,int numOfStudent,String headOfDepartment,Student s)
	{
		this.id=id;
		this.name=name;
		this.numOfStudent=numOfStudent;
		this.headOfDepartment=headOfDepartment;
		this.s=s;
	}
	public String toString()
	{
		return id+" "+name+" "+numOfStudent+" "+headOfDepartment+" "+s;
	}

}
