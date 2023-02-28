package Local_and_Global_Variables;

public class demo2 
{ 
	static int F=11;
	public static void main(String[] args) 
	{
		System.out.println(F);
		System.out.println(demo1.a);
		demo2 A=new demo2();
		A.m3();
	}
	public void m3()
	{
		System.out.println(F);
	}
	

}
