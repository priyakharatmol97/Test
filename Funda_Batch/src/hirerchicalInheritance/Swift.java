package hirerchicalInheritance;

public class Swift extends Maruti
{
	String engine,modelNo;
	int groundClear;
	
	public void setEngine(String engine)
	{
		this.engine=engine;
	}
	public String getEngine()
	{
		return engine;
	}
	
	public void setModelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
	public String getModelNo()
	{
		return modelNo;
	}
	
	public void setGroundClear(int groundClear)
	{
		this.groundClear=groundClear;
	}
	public int getGroundClear()
	{
		return groundClear;
	}
	
	void display()
	{
		System.out.println(name+" "+modelNo+" "+color+" "+price+" "+engine+" "+groundClear);
	}


}
