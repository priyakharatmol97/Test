package enuminjava;

public enum Colors implements ColorsInterface 
{
	ORANGE("RED","YELLOW")
	{
		public void description()
		{
			System.out.println("Combination of red and yellow is Orange");
		}
	}
	,PURPLE("BLUE","RED")
	{
		public void description()
		{
			System.out.println("Combination of blue and red is Purple");
		}
	}
	,PINK("RED","WHITE")
	{
		public void description()
		{
			System.out.println("Combination of red and white is Pink");
		}
	}
	,GREEN("BLUE","YELLOW")
	{
		public void description()
		{
			System.out.println("Combination of blue and yellow is Green");
		}
	}
	,BROWN("GREEN","RED")
	{
		public void description()
		{
			System.out.println("Combination of green and red is Brown");
		}
	};
	Colors(String string,String string2)
	{
		
	}

	

}
