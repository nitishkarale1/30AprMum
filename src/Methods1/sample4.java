package Methods1;

public class sample4 

{

	//non static regular method call from same class
	
	public static void main(String[] args) 
	
	{
		System.out.println("India is the world's largest Democracy");
		
		//object creation syntax-->classname objectname=new classname();
		sample4 A=new sample4();   //create object of same class
		A.e1();                    //method call-->objectname.methodname();
		A.e2();
		A.e3();                    //sample4-->classname-->datatype
	                               //A-->objectname-->use to identify/refer object
		                           //new-->keyword-->use to create blank/empty object
		                           //sample4-->constructor-->use to copy/load all data from class into object
	}
	
	
	public void e1()     //non static regular method
	{
		System.out.println("India got Independence in 1947");
	}
	
	public void e2()
	{
		System.out.println("Jawaharlal Nehru was the first prime minister of India");
	
	}
	
	public void e3()
	{
		System.out.println("He served as the country's prime minister for 17 years");
	}
}
