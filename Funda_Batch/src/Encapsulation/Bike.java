package Encapsulation;

public class Bike 
{
	private int id,price,EMI,pay,discountPrice;
	private String name,engine,color;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
		
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setPay(int pay)
	 {
		 this.pay = pay;
	 }
	 public int getPay()
	 {
		 return pay;
	 }
	 public void setDiscountPrice(int pay)
	 {
		 if(pay==1)
	     {
	       int  discountPrice = price-price/100*20; 
	       System.out.println("Discounted Prise Is:"+ discountPrice);
	      }
		 else if(pay==2)
		 {
	      int discountPrice = price-price/100*10; 
	       System.out.println("Discounted Prise Is:"+ discountPrice);
	    }
		 else if (pay == 3) 
		 {
			 int discountPrice = price-price/100*5; 
		       System.out.println("Discounted Prise Is:"+ discountPrice);
		 }
		 else
		 {
			 System.out.println("Should Be No Discount");
		 }
	 }
	 
		 public int getDiscountPrice()
		 {
		 return discountPrice;
	 }
	
	public void setEMI(int EMI)
	{
	 
		this.EMI=EMI;
		
	}
	public int getEMI()
	{
		return EMI;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setEngine(String engine)
	{
		this.engine=engine;
	}
	public String getEngine()
	{
		return engine;
	}
	
	
	public void setColor(String color)
	{
		this.color=color;
	}
    public String getColor()
    {
    	return color;
    }
}
