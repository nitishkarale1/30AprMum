package constructor_overloading;

public class sample9 
{
     int A;
     int B;
     int C;
     
    sample9(int a,int b, int c)
    {
    	A=a;
    	B=b;
    	C=c;
    }
    
    sample9()
    {
    	A=5;
    	B=2;
    	C=9;
    }
    
    public void addition()
    {
    	System.out.println(A+A+B+B+C+C);
    }
    
    public void multiplication()
    {
    	System.out.println(A*B*C);
    }
    
    public static void main(String[] args) 
    {
	     sample9 S1=new sample9();
	     S1.addition();
	     S1.multiplication();
    
         sample9 S2=new sample9(7,8,9);
         S2.addition();
         S2.multiplication();
    
    }
    
}
