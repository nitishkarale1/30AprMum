package constructor_overloading;

public class sample8 
{
	float A;
	float B;
	float C;
	
	sample8()
	{
		A=15;
		B=9;
		C=5;
		
	}
	
	sample8(float a, float b, float c)
	{
		A=a;
		B=b;
		C=c;
	}
	
	public void multiplication()
	{
		System.out.println(A*B*C);
		System.out.println(B*C);
	}
	
	public void addition()
	{
		System.out.println(A+B+C);
		System.out.println(A+C);
	}
	
	public static void main(String[] args)
	{ 
		 sample8 D2=new sample8();
		    D2.multiplication();
		    System.out.println("--------------");
		    
	    sample8 D1=new sample8(2.5f, 5.5f, 4.5f);
	    D1.multiplication();
	    System.out.println("---------------");
	    
	    sample8 D4=new sample8();
	    D4.addition();
	    System.out.println("---------------");
	    
	    sample8 D3=new sample8(7.0f,5.5f, 9.5f);
	    D3.addition();
	    System.out.println("---------------");
	    
	    
	}	

}
