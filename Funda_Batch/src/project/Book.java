package project;

public class Book 
{
	int id,price,copyNo;
	String name,author;
	
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
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setCopyNo(int copyNo)
	{
		this.copyNo=copyNo;
	}
	public int getcopyNo()
	{
		return copyNo;
	}
	public String toString()
	{
		return id+" "+name+" "+author+" "+price+" "+copyNo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
	}

	

}
