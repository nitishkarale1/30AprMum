package user_defined_constructor;

public class sample12 
{

	
	//3: example of user defined constructor with parameter
	
	int num1;   //6
	int num2;   //6
	
	//user defined constructor with int,int(2 int) parameter
	//use1: to initialize global variable
	sample12(int a, int b)  //6, 6
	{
		num1=a;     //6      //assign local variable info into global variable
		num2=b;     //6
	}
		
	public void addition() 
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication() 
	{
		System.out.println(num1*num2);
	}
		
	public static void main(String[] args) 
	{
		sample12 s5=new sample12(6,6);
		s5.addition();     //12
		s5.multiplication();    //36
	}
}
