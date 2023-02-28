package Single_level_Inheritance;

public class sample8 extends sample7
{
	int C;
	int D;
	
	sample8()
	{
		C=100;
		D=50;
	}
	
	public void division()
	{
		System.out.println(C/D);
	}
	
	public static void main(String[] args) 
	{
		sample8 s1=new sample8();
		s1.addition();
		s1.multiplication();
		s1.division();
	}
}
