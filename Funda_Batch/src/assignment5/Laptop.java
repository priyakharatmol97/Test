package assignment5;

public class Laptop 
{
	int noOfUSBPort,processorSpeed;
	
	public void setNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort=noOfUSBPort;
	}
	public int getnoOfUSBPort()
	{
		return noOfUSBPort;
	}
	
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed=processorSpeed;
	}
	public int getprocessorSpeed()
	{
		return processorSpeed;
	}
	
	public static void main(String args[])
	{
		Laptop l=new Laptop();
		l.setNoOfUSBPort(12);
		l.setProcessorSpeed(10);
		
		System.out.println(l.getnoOfUSBPort()+" "+l.getprocessorSpeed());
	}

}
