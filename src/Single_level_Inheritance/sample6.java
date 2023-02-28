package Single_level_Inheritance;

public class sample6 extends sample5
{
	public void v()
	{
		System.out.println("v=rahul");
	}
	
	public void w()
	{
		System.out.println("w=atul");
	}
	
	public static void main(String[] args)
	{	 
		sample6 A=new sample6();
		A.v();
		A.w();
		A.s();
		A.t();
		A.u();
	}
}
