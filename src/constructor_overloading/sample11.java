package constructor_overloading;

public class sample11 
{
	int a;
	int b;
	
	sample11()
	{
		a=10;
		b=20;
	}
	
	sample11(int c, int d)
	{
		a=c;
		b=d;
	}
	
	public void addition()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		sample11 D=new sample11();
	    D.addition();
	    
	    System.out.println("-----");
				
		sample11 E=new sample11(45,55);
	    E.addition();
				
	}
}
