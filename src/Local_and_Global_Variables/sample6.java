package Local_and_Global_Variables;

public class sample6 
{
	int d=10;
	
	public static void main(String[] args) 
	{
		//non-static global variable call from same class
		sample6 s1=new sample6();
		System.out.println(s1.d);
		
		//non-static global variable csll from diff class
		sample7 s2=new sample7();
		System.out.println(s2.e);
		m1();
		sample6 d1=new sample6();
		d1.m2();
	}
	
	public static void m1()
	{
		sample6 s3=new sample6();
		System.out.println(s3.d);
	}
	
	public void m2()
	{
		System.out.println(d);
	}

}
