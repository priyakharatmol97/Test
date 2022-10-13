package project;

public class Transction {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.display();
		
		
		
		Book b=new Book();
		b.setId(1);
		b.setName("Priya");
		b.setPrice(100);
		b.setAuthor("Guy-de-Maupassant");
		b.setCopyNo(200);
		
		System.out.println(b.getId()+" "+b.getName()+" "+b.getPrice()+" "+b.getAuthor()+" "+b.getcopyNo());
		
		
		
		
		
			

	}

}
