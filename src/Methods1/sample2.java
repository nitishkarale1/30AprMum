package Methods1;

public class sample2
{
	//non static regular method call from same class
	public static void main(String[] args) 
	
	{
		//syntax for object creation-->classname objectname=new classname();
		sample2 c1=new sample2();   //1.create object of same class 
		c1.d1();                    //2.method call-->object name.methodname();
		c1.d2();
		
		                            //1.sample2-->class name-->datatype
		                            //2.c1-->objectname-->use to identify object
		                            //3.new-->keyword-->use to create new blank/empty object
		                            //4.sample2-->constructor-->use to copy all members from class to object
		
	}
	
	public void d1()     //non static regular method
	{
		System.out.println("my name is Nitish Karale and I am from Aurangabad");
		System.out.println("I have completed my graduation in Computer Science");
		System.out.println("now I am looking forward to pursue my career in IT industry");
	}

	public void d2() 
	{
		System.out.println("I have joined Velocity institute for software testing course");
		System.out.println("There are two categories of software testing-1) Automation & 2) Manual testing");
		
	}
}
