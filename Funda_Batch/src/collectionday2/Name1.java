package collectionday2;

import java.util.Comparator;

public class Name1 implements Comparator<Item>
{
	public int compare(Item o1, Item o2) 
	{
		return o1.item_name.compareTo(o2.item_name);
    }
}
