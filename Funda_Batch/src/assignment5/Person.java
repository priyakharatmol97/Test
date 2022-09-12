package assignment5;

public class Person 
{
	int id;
	String personName,contact,address,idProof;
	

	public void setPersonData(int id,String personName,String contact,String address,String idProof)
	 {
		this.id=id;
		this.personName=personName;
		this.contact=contact;
		this.address=address;
		this.idProof=idProof;
	}
	public void Display()
	{
      System.out.println(personName+" "+contact+" "+address+" "+idProof);
	}
}




	
	
	


