package Local_and_Global_Variables;

public class sample10 
{
static int l=50;
	
	public static void main(String[] args) 
	{
		//static global variable call from same class
		System.out.println(l);
		
		//static variable call from from diff class
		System.out.println(sample11.j);
		
		//non-static variable call from diff class
		sample11 n=new sample11();
		System.out.println(n.p);
		
		m1();
		
		sample10 q=new sample10();
		q.m2();
	}
	
	public static void m1()
	{
		System.out.println(l);
		System.out.println(sample11.j);
		sample11 n=new sample11();
		System.out.println(n.p);
		
	}
	
	public void m2()
	{
		System.out.println(l);
	    System.out.println(sample11.j);
	    sample11 n=new sample11();
		System.out.println(n.p);
		//System.out.println(sample11.p);
	}
				
}





