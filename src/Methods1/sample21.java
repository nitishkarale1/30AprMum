package Methods1;

public class sample21 

{
	//non static regular method call from diff class
	
	public static void main(String[] args)    //pre-defined method
	
	{
		//object creation syntax-->diff classname objectname==new diff classname();
		sample22 F1=new sample22();
		                               //sample22-->diff classname-->datatype
		                               //F1-->objectname-->used to identify/ refer object
		                               //new-->keyword-->used to create new blanl/empty object
		                               //sample22-->constructor-->used to copy all data from class into object
		
		
		
		F1.demo();   //method call-->objectname.diff class methodname();
		F1.demo1();
		F1.demo2();
		F1.demo3();
		F1.demo4();
	}

}
