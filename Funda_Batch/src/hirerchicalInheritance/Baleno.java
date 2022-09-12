package hirerchicalInheritance;

public class Baleno extends Maruti 
{
	String engine,modelNo;
	
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
	
	void display()
	{
		System.out.println(name+" "+modelNo+" "+color+" "+price+" "+engine);
	}

}
