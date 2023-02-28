package user_defined_constructor;

public class sample1
{
	//step1:declaration of global variable
    int num1;
    int num2;
    
    //step2:initialization of global variable
    //user defined constructor-->provided by user
    //use1:to initialize global variable
    //use2:copy all members of class into object
    sample1()
    {
    	num1=10;
    	num2=20;
    }
    
    //usage
    public void addition()
    {
    	System.out.println(num1+num2);
    	System.out.println("-----");
    }
    
    public void multiplication() 
    {
    	System.out.println(num1*num2);
    	System.out.println("-----");
    }
    
    public static void main(String[] args) 
    {
    	sample1 s1=new sample1();
    	s1.addition();
    	s1.multiplication();
    	
    	sample2 s2=new sample2();
    	s2.subtraction();
	}
}