package this_and_super_keyword;

public class sample1 extends sample2
{
	int a=20;
	
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) 
	{
		sample1 S=new sample1();
		S.m1();
	}
}
