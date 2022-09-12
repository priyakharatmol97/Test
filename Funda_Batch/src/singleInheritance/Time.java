package singleInheritance;

public class Time extends Date
{
	int hrs,min,sec;
	
	public void setHrs(int hrs)
	{
		this.hrs=hrs;
	}
	public int getHrs()
	{
		return hrs;
	}
	
	public void setMin(int min)
	{
		this.min=min;
	}
	public int getMin()
	{
		return min;
	}
	
	public void setSec(int sec)
	{
		this.sec=sec;
	}
	public int getSec()
	{
		return sec;
	}
	
	/*void display() 
	{
		System.out.println(date+" /"+month+" /"+year+" "+hrs+":"+min+":"+sec);
		
	}*/

}
