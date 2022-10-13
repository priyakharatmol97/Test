package hashmapinjava;

import java.util.HashMap;

public class HashMapInternal {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("xx", "Navya");
		hm.put("yy", "Priya");
		hm.put("zz", "Ram1");
		hm.put("xx1", "Navya1");
		hm.put("yy1", "Priya1");
		hm.put("xx2", "Navya");
		hm.put("yy2", "Priya");
		hm.put("zz2", "Ram");
		hm.put("xx3", "Navya");
		hm.put("yy3", "Priya");
		hm.put("aa", "Ram");
		hm.put("bb", "Navya");
		hm.put("cc", "Priya");
		hm.put("dd", "Ram");
		hm.put("hh", "Navya");
		hm.put("kk", "Priya");
		hm.put("ll", "Ram");
		
		
		
		hm.put(null, "Abc");

	}

}
