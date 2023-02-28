package Methods1;

public class sample8 

{
	//non static regular method call from same class
	
	public static void main(String[] args) 
	
	{
		sample8 E=new sample8();
		E.I();
		E.I1();
		E.I2();
		
	}
	
	public void I()
	{
		System.out.println("Mumbai is the capital maharashtra");
	}
	
	public void I1()
	{
		System.out.println("it is a densely pupulated city");
	}
	
	public void I2()
	{
		System.out.println("Marine Drive is the famous place in mumbai");
	}

}
