package this_and_super_keyword;

public class sample6 extends sample5
{
	String x="Machhindranath";
	
	public void A1()
	{
		String x="Nitish";
		System.out.print(x+" ");
		System.out.print(this.x+" ");
		System.out.print(super.x);
	}
	
	public static void main(String[] args) 
	{
		sample6 D=new sample6();
		D.A1();
	}
}
