package Method2;

public class sample3 

{
	//method call without/zero parameter
	public static void main(String[] args) 
	{  
	    //static regular method call from same class
		s1();
		
		//static regular method call from diff class
		sample4.s2();
		
		//non static regular method call from same class
		sample3 A=new sample3();
		A.s3();
		
		//non static regular method call from diff class
		sample4 B=new sample4();
		B.s4();
		
	}
	
	public static void s1()
	{
		System.out.println("running static regular method from same class");
	}
	
	public void s3()
	{
		System.out.println("running non static regular method from same class");
	}

}
