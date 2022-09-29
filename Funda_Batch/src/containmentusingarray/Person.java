package containmentusingarray;

import java.util.Arrays;

public class Person 
{
	int id;
	String name,contact;
	IdProof idp[];
	
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	
	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	public String getContact() 
	{
		return contact;
	}
	
	
	
	public void setIdp(IdProof[] idp) 
	{
		this.idp = idp;
	}
	public IdProof[] getIdp() 
	{
		return idp;
	}
	
	
	public String toString()
	{
		return id+" "+name+" "+contact+" "+Arrays.toString(idp);
	}

}
