package xyz;

public class FrirstMain {

	public static void main(String[] args) 
	{
		FirstAidKit f=new FirstAidKit();
		f.setNoOfMedicine(10);
		f.setNoOfBandage(4);
		f.setMedicineName("PainCular");
		f.setBnadageName("xyz");
		
		System.out.println(f.getNoOfMedicine()+" "+f.getNoOfBandage()+" "+f.getMedicineName()+" "+f.getBnadageName());

	}

}
