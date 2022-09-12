package singleInheritance;

public class DateTimeMain {

	public static void main(String[] args) 
	{
		/*Date d=new Date();
		d.setDate(12);
		d.setMonth(2);
		d.setYear(2021);*/
		
		
		Time t=new Time();
		t.setHrs(12);
		t.setMin(20);
		t.setSec(10);
		t.setDate(12);
		t.setMonth(2);
		t.setYear(2022);
		//t.display();
		System.out.println(t.getDate()+"/"+t.getMonth()+"/"+t.getYear());
		System.out.println(t.getHrs()+":"+t.getMin()+":"+t.getSec());
	}

}
