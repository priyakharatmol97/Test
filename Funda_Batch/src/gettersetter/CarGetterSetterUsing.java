package gettersetter;

public class CarGetterSetterUsing 
{
	private int id;
	private String name,cnumber;
	
	DriverGetterSetterUsing d;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCnumber(String cnumber)
	{
		this.cnumber=cnumber;
	}
	public String getCnumber()
	{
		return cnumber;
	}
	
	public void setDriverGetterSetterUsing(DriverGetterSetterUsing d)
	{
		this.d=d;
	}
	public DriverGetterSetterUsing getDriverGetterSetterUsing()
	{
		return d;
	}
	
}
