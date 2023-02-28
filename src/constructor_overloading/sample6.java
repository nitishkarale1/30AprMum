package constructor_overloading;

public class sample6 
{
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	
    sample6()
    {
    	num1=15;
    	num2=20;
    	num3=5;
    	num4=10;
    	num5=8;
    }
    
    sample6(int a, int b, int c, int d, int e)
    {
    	num1=a;
        num2=b;
    	num3=c;
    	num4=d;
    	num5=e;
    }
    
    public void addition()
    {
    	System.out.println(num1+num2+num3+num4+num5);
    }
    
    public void multiplication()
    {
    	System.out.println(num2*num4);
    }
    
    public void subtraction()
    {
    	System.out.println(num5-num4-num3-num2-num1);
    }
    
    public void division()
    {
    	System.out.println(num2/num5);
    }
    
    
    public static void main(String[] args) 
    {
	   
    	sample6 A=new sample6();
    	A.addition();
    	System.out.println("----------");
    	
    	sample6 B1=new sample6(2, 5 ,6,7,8);
    	B1.addition();
    	
    	sample6 B=new sample6();
    	B.multiplication();
    	System.out.println("----------");
    	
    	sample6 C=new sample6();
    	C.subtraction();
    	System.out.println("----------");
    	
    	sample6 D=new sample6();
    	D.division();
    	
    	
    	
	}
	
}
