package practiceall;

public class DateTimeMain {

	public static void main(String[] args) 
	{
		Time t=new Time();
		
		t.setdate(12);
		t.setMonth(2);
		t.setYear(2022);
		t.setTime(11);
		t.setMinute(56);
	    t.setSecond(45);
	    
	    System.out.println(t.getDate()+"/"+t.getMonth()+"/"+t.getYear());
	    System.out.println(t.getTime()+":"+t.getMinute()+":"+t.getSecond());

	}

}
