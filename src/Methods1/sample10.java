package Methods1;

public class sample10 

{
	//non static regular method call from same class
	
	public static void main(String[] args) 
	
	{
		//object creation syntax-->classname objectname=new classname
		
		sample10 N=new sample10();     //create object of same class 
		                               //sample10-->classname-->datatype
		                               //N-->objectname-->use to identify/refer object
		                               //new-->keyword-->use to create new blank/empty object
		                               //sample10-->constructor-->use to copy/load all the data from class into object
		
		N.K();       //method call-->objecname.methodname();                    
		N.K1();
		N.K2();
		
	}
	
	public void K()
	{
		System.out.println("Rupee is the courrency of India");
	}
	
	public void K1()
	{
		System.out.println("Dirham is the currency of UAE");
	}
	
	public void K2()
	{
		System.out.println("dollar is the currency of USA");
	}

}
