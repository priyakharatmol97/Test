package arraylistimportantall;

import java.util.ArrayList;

public class RemoveOrRemoveAllMethod {

	public static void main(String[] args) 
	{
       ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		
        System.out.println(al);
		
		Integer a=30;
		System.out.println(a);
		
		System.out.println(al.remove(a));
		System.out.println(al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		
		//al.removeAll(al2);
		
		System.out.println(al);
		//System.out.println(al2);
		
		
	//   set(update)
			/*System.out.println(al);
			System.out.println(al.set(4, 50));
			System.out.println(al);*/
		 
			
			// contains(search)
			Boolean b=al.contains(40);
				if(b==true)
				{
					System.out.println("Given element is present");
				}
				
				else
					System.out.println("Given element is not present");
				
			//get
				System.out.println(al.get(4));
				
				int a1=al.indexOf(20);
				System.out.println(a1);
	}

}
