package Methods1;

public class sample3 
{
	//non static regular method call from same class
	public static void main(String[] args) 
	
	{
		System.out.println("I am A video vlogger");
		//syntax for object creation-->classname objectname=new classname();
		sample3 c2=new sample3();    //1.create object of same class 
		c2.model1();                 //2.method call-->objectname.methodname();
		c2.model2();
		c2.model3();
		
		                             //1.sample3-->classname-->datatype
		                             //2.c2-->objectname-->use to identify object/refer object
		                             //3.new-->keyword-->use to create blank/empty object
		                             //4.sample3-->constructor--> use to copy/load all members from class into object 
		
		
		
	}
	
	public void model1()    //non static regular method
	{
		System.out.println("I love to travel and explore new destinations");
	}
    
	public void model2()    //non static regular method
	{
		System.out.println("I have created my own youtube channel named 'NisargWari'");
	}
	
	public void model3()    //non static regular method
	{
		System.out.println("I make videos of historical places like forts,ancient temples etc.");
	}
}
