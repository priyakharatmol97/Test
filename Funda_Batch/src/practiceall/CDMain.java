package practiceall;

public class CDMain {

	public static void main(String[] args) 
	{
		Driver d=new Driver(1,"Priya","MH-213");
	    //System.out.println(d);
		Car c=new Car(101,"Baleno","7977956202",d);
		System.out.println(c);
		

	}

}
