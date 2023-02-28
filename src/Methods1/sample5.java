package Methods1;

public class sample5 

{
	//non static reular method call from same class
	
	public static void main(String[] args)
	
	{
		//object creation syntax-->classname objectname=new classname();
		sample5 B=new sample5();    //create object of same class
		B.f();                      //method call-->objectname.methodname
		B.f1();
		B.f2();                    //sample5-->classname-->datatype
	                               //B-->objectname-->use to identify/refer object
		                           //new-->keyword-->use to create blank/empty object
		                           //sample5-->constructor-->use to copy/load all data from class into object
	}
		
	
	public void f()    //non static regular method
	{
		System.out.println("Diwali is the biggest and most important festival of India");     //printing statement
	}
	
	public void f1()
	{
		System.out.println("it is the festival of lights");
	}
	
	public void f2()
	{
		System.out.println("goddess Laxmi is worshipped on this day");
	}

}
