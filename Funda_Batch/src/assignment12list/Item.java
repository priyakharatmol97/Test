package assignment12list;

public class Item 
{
	int item_id;
	String item_Name;
	
	Item(int item_id,String item_Name)
	{
		this.item_id=item_id;
		this.item_Name=item_Name;
	}
	
	public String toString()
	{
		return item_id+" "+item_Name;
	}

}
