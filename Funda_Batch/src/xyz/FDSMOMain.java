package xyz;

public class FDSMOMain {

	public static void main(String[] args) 
	{
		System.out.println("Father Method");
		FatherMO f=new FatherMO();
		f.house();
		f.vehicle();
		System.out.println();
		
		System.out.println("Daughter Method");
		f=new DaughterMO();
		f.house();
		f.vehicle();
		System.out.println();
		
		System.out.println("Son Method");
		f=new SonMO();
		f.house();
		f.vehicle();
		
	

	}

}
