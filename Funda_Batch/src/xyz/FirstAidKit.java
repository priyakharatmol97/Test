package xyz;

public class FirstAidKit 
{
	private int noOfBandage,noOfMedicine;
	private String MedicineName,BnadageName;
	
	public void setNoOfBandage(int noOfBandage)
	{
		this.noOfBandage=noOfBandage;
	}
	public int getNoOfBandage()
	{
		return noOfBandage;
	}
	public int getNoOfMedicine() {
		return noOfMedicine;
	}
	public void setNoOfMedicine(int noOfMedicine) {
		this.noOfMedicine = noOfMedicine;
	}
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getBnadageName() {
		return BnadageName;
	}
	public void setBnadageName(String bnadageName) {
		BnadageName = bnadageName;
	}



}
