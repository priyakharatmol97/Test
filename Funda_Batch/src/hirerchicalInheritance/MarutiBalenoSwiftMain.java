package hirerchicalInheritance;

public class MarutiBalenoSwiftMain {

	public static void main(String[] args)
	{
		Baleno b=new Baleno();
		b.setName("Baleno");
		b.setColor("Black");
		b.setPrice(700000);
		b.setEngine("BalengoAlpha");
		b.setModelNo("10mm");
		b.display();
		
		Swift s=new Swift();
		s.setName("Swift");
		s.setColor("White");
		s.setPrice(800000);
		s.setEngine("SwiftAlpha");
		s.setModelNo("5hp");
		s.setGroundClear(163);
		s.display();
				

	}

}
