package assignment5;

public class Account 
{
	private String acntNo,ifsc;
	
	Account(String acntNo,String ifsc)
	{
		this.acntNo=acntNo;
		this.ifsc=ifsc;
	}
	
	public String toString()
	{
		return acntNo+" "+ifsc;
	}

}
