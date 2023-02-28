package Method3;

public class sample3 
{
	//method with parameter
	public static void main(String[] args) 
	{
		A(25,45);
		A(62,24);
		
		System.out.println("---------------");
		
		sample4.B(55, 22);
		sample4.B(75,85);
		
		System.out.println("---------------");
		
		sample3 D1=new sample3();
		D1.C(15,5);
		D1.C(30,5);
		
		System.out.println("---------------");
		
		sample4 D2=new sample4();
		D2.D(120,20);
		D2.D(88,11);
		
		System.out.println("---------------");
	
		
	}
	
	//method with int,int/(2int) parameter
	public static void A(int a,int b)
	{
		System.out.println(a+b);
	}
	
	//method with int,int/(2int) parameter
	public void C (int e,int f)
	{
		System.out.println(e*f);
	}

}
