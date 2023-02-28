package Method_overloading;

public class sample3
{
	public void Name(String a, String b)
	{
		System.out.println(a+" "+b);
	}
	
	public void Name(String a, String b,String c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	
	public void Name(String a, String b, String c,String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public static void main(String[] args)
	{
		sample3 A=new sample3();
		A.Name("Nitish", "Karale");
		System.out.println("------------------------------");
		
		A.Name("Nitish", "Machhindranath", "Karale");
		System.out.println("------------------------------");
		
		A.Name("Nitish","Vijaya","Machhindranath","Karale");
		System.out.println("------------------------------");
	}
}
