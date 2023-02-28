package Local_and_Global_Variables;

public class sample8 
{
	int f=25;   //non-static global variable
	int d=45;
	public static void main(String[] args) 
	{
		//non-static global variable call from same class
		sample8 a=new sample8();
		System.out.println(a.f);
		
		
		//non-static variable call from diff class
		sample9 b=new sample9();
		System.out.println(b.g);
		
		s1();
		
	    sample8 k=new sample8();
	    k.s2();
	}
	
	public static void s1()
	{   
		sample8 a=new sample8();
		System.out.println(a.d);
	}
	
	public void s2()
	{
		System.out.println(f);
	}

}
