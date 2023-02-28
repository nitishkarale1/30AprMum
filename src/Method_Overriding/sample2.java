package Method_Overriding;

public class sample2 extends sample1 
{
	//method overriding
	public void money()  //method override
	{
		System.out.println("money:1500");  
	}
	
	public void car()
	{
		System.out.println("car:TATA Nexon");
	}
	
	public static void main(String[] args) 
	{
		sample2 B=new sample2();
		B.money();
		B.car();
		System.out.println("-------------");
		
		//sample1 C=new sample1();
		//C.money();
		//C.car();
	}
}
