package wrapperclass;
import java.util.Arrays;

public class RainbowColorsMain {

	public static void main(String[] args) 
	{
		RainbowColors rc1=RainbowColors.BLUE;
		RainbowColors rc2=RainbowColors.INDIGO;
		
		System.out.println(rc1.ordinal());
		
		RainbowColors rc[]= RainbowColors.values();
		
		for(RainbowColors rlc:rc)
		{
			System.out.println(rlc+"-"+rlc.ordinal());
		}
		
		
		

	}

}
