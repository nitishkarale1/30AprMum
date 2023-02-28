package Methods1;

public class sample7 

{
	//non static regular method call from same class
	
	public static void main(String[] args)
	
	{
		//object creation syntx-->classname objectname==new classname
		
		sample7 D=new sample7();
		D.H();
		D.H1();
		
	}
	
	public void H()
	{
		System.out.println("Aurangabad is the tourism capital of Maharashtra");
		
	}
	
	public void H1()
	{
		System.out.println("It is also called as 'City ofGates'");
	}

}
