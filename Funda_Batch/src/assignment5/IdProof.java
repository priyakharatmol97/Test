package assignment5;

public class IdProof extends Person
{
String name,number,validity;
	
	public  void setIdProofData(String name,String number,String validity)
	{
		this.name=name;
		this.number=number;
		this.validity=validity;
	}
	
	public void Display()
	     {
		    if(idProof.equals("AdharCard")&& address.equals("Pune"))
		    {
		     super.Display();
		     System.out.println(name+" "+number+" "+validity);
		    }
		    else
		    {
		    	System.out.println("Can't Find the Address who stay in Pune and have AdhaarCard as idProof");
		    }
		     
	 }



}
