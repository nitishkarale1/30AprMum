package Casting;

public class implicit_casting1 
{
	int a=1232532145;
    int b=25;
    
	long c=a;
    long d=b;
    
	public void addition()
	{
		System.out.println(c+d);
	}
	
	public static void main(String[] args) 
	{
		implicit_casting1 A=new implicit_casting1();
		A.addition();
	}
	
}
