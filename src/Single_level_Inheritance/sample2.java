package Single_level_Inheritance;

public class sample2 extends sample1
{
	public void Money() 
	{
		System.out.println("Money: 5cr");
	}
	
	public void Bike()
	{
		System.out.println("Bike: Yamaha");
	}
	
	public void Smartphone()
	{
		System.out.println("Smartphone:Oneplus");
	}
	
	public static void main(String[] args) 
	{
		sample2 s2=new sample2();
		s2.Company();
		s2.Money();
		s2.Flat();
		s2.Bike();
		s2.Smartphone();
		
	}
}
