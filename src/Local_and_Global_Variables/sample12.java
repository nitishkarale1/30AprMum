package Local_and_Global_Variables;

public class sample12 
{
	static int M=10;
	static int J=15;
	       int N=75;
	
	public static void main(String[] args) 
	{
		System.out.println(M);
		System.out.println("-----");
		sample12 a1= new sample12();
		System.out.println(a1.N);
		System.out.println("-----");
		
		sample13 a2=new sample13();
		System.out.println(a2.P);
		System.out.println("-----");
		
		System.out.println(sample13.Q);
		System.out.println("-----");
		
		sample12 b=new sample12();
		b.m1();
		System.out.println("-----");
		
		m2();
		System.out.println("-----");
	}
	
	public void m1()
	{
		System.out.println(N/M);
		System.out.println(N-M);
		System.out.println("-----");
		System.out.println(N);
		System.out.println("-----");
		System.out.println(M);
	}
	
	public static void m2()
	{
		System.out.println(M*J);
		sample12 a=new sample12();
		System.out.println((a.N)*M);
		System.out.println("-----");
		
		
		sample12 a1=new sample12();
		System.out.println(a1.N);
		System.out.println("-----");
		System.out.println(M);
	}

}
