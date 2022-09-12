package assignment5;

public class Saving 
{
	private int balance,transctionDate;
	
	Saving(int balance,int transctionDate)
	{
		this.balance=balance;
		this.transctionDate=transctionDate;
	}
	
	public String toString()
	{
		return balance+" "+transctionDate;
	}
	
	

}
