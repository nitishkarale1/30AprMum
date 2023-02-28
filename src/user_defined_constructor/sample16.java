package user_defined_constructor;

public class sample16 
{
    int A;
	int B;

	
	sample16(int a,int b)  //user defined constructor with parameter
	{
		A=a;     //assign local variable value into global variable
		B=b;		
	}
	
	public void addition()
	{
		System.out.println(A+B);
	}
	
	public void multiplication() 
	{
	   System.out.println(A*B);	
	}
	
	public static void main(String[] args) 
	{
	    sample16 s1=new sample16(10,20);
	    s1.addition();
	    s1.multiplication();	    
	    System.out.println("-----");
	    
	    sample17 s2=new sample17(100,15);  //
	    s2.division();
	    s2.subtraction();
	}
	
}
