package constructor_overloading;

public class sample5 
{
	int F;
	int G;
	sample5 ()
	{
		F=12;
		G=8;
	}
	
	sample5(int a, int b)
    {
	    F=a;
	    G=b;
   }	
	public void addition()
	{
		System.out.println(F+G);
	}
	
	public void subtraction()
	{
		System.out.println(F-G);
	}
	
	public static void main(String[] args) 
	{
	   sample5 s1=new sample5();
	   s1.addition();
	   s1.subtraction();
	   
	   sample5 s2=new sample5(15,9);
	   s2.addition();
	   s2.subtraction();
	}
}

