package Interface_Implementation_class;

public class sample33 implements sample3 
{
	public void addition()
	{
		System.out.println(5+5);
	}
	
	public void subtraction()
	{
		System.out.println(10-2);
	}
	
	public void division()
	{
		System.out.println(20/5);
	}
	
	public static void main(String[] args) 
	{
		sample33 S=new sample33();
		S.addition();
		S.subtraction();
		S.division();
	}
}
