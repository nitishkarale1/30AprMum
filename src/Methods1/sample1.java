package Methods1;

public class sample1
{
   //non static regular method call from same class
	
	public static void main(String[] args) 
	
	{
		//classname objectname=new classname(); --> syntax for object creation
		
		sample1 s1=new sample1();  //1.create object of same class
		s1.A1();                   //2.method call-->objectname.methodname();
		s1.A2();
		s1.A1();
		                           //1.sample1-->classname-->datatype
		                           //2.s1-->objectname-->use to identify/refer object
		                           //3.new-->keyword-->use to create blank/empty object
		                           //4.sample1();-->classname-->constructor-->use to copy/load all the members of class into object
    }
	
	
	public void A1()               //non static regular method
	{
		System.out.println("running non static regular method A1 in same class");
	}
	
	public void A2()                //non static regular method
	{
		System.out.println("runningnon static regular method A2 in same class");
	}
}
