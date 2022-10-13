package assignment12list;

public class Clinic 
{
    Integer c_id;
    String c_name;
    String location;
    Integer rating;
    Doctor d;
  
    
    public Clinic(Integer c_id,String c_name,String location,Integer rating,Doctor d)
    {
    	this.c_id=c_id;
    	this.c_name=c_name;
    	this.location=location;
    	this.rating=rating;
    	this.d=d;
    }
    
    public String toString()
    {
		return c_id+" "+c_name+" "+location+" "+rating+" "+d;
    	
    }



}
