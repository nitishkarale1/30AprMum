package Casting;

public class up_casting1 
{
	public static void main(String[] args) 
	{
		//create object of subclass with reference of super class
		father A=new son();
		A.car();
		A.money();
		A.home();
	}
}
