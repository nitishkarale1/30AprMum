package this_and_super_keyword;

public class sample3 extends sample4
{
	int b=35;
	int c=45;
	
	public void s1()
	{
		int b=55;
		int c=65;
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(this.b);
		System.out.println(this.c);
		
		System.out.println(super.b);
		System.out.println(super.c);
	}
	
	public static void main(String[] args) 
	{
		sample3 A=new sample3();
		A.s1();
	}
}
