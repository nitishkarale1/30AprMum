package Method2;

public class sample1 

{
	//method without/zero parameter
	public static void main(String[] args) 
	{
		//1.Static regular method call from same class
		
		m1();
		
		System.out.println("---------------");
		
		//2.Static regular method call from diff class
		
		 sample2.m2();
		 
		 System.out.println("---------------");
		 
		 //3.non static regular method call from same class
		 sample1 s7=new sample1();
		 s7.m3();
		 
		 System.out.println("---------------");
		 
		 //4.non static regular method call from diff class
		 sample2 s8=new sample2();
		 s8.m4();
		 
		
	}
	
	public static void m1()   //method without/zero parameter
	{
		System.out.println("running static regular method from same class");
	}
	
	public void m3()          //method without/zero parameter
	{
		System.out.println("running non static regular method from same class");
	}
	


}
