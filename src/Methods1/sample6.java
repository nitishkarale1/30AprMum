package Methods1;

public class sample6 

{
    //non static regular method call from same class
	
	public static void main(String[] args) 
	
	{
		System.out.println("Jayakwadi dam is the biggest irrigation project of maharashtra");
		
		//object creation syntax-->classname objectname=new classname();
		sample6 C=new sample6();
		
		C.g();
		C.g1();
		C.g2();
		
	}
	
	public void g()    //non static regular method
	{
		System.out.println("it is built on Godavari riverin paithan");    //printing statement
	}
	
	public void g1()
	{
		System.out.println("the dam can store upto 102 TMC of water");
	}
	
	public void g2()
	{
		System.out.println("Jayakwadi dam is also known as 'Nathsagar'");
	}
}
