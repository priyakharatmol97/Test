package assignment5;

public class ASMain {

	public static void main(String[] args) 
	{
	    Saving s=new Saving(2000,10);
	    Saving s2=new Saving(4000,20);
	    Saving s3=new Saving(6000,30);
	    
	    Account a=new Account("9856438087","SBI456098");
	    Account a2=new Account("6789424679","SBI098349");
	    Account a3=new Account("7834097645","IDFC563408");
	    
	    System.out.println(a+" "+s);
	    System.out.println();
	    System.out.println(a2+" "+s2);
	    System.out.println();
	    System.out.println(a3+" "+s3);
	    System.out.println(); 

	}

}
