package Methods1;

public class sample11 

{
      //non static regular method call from diff class
	public static void main(String[] args) 
	{
		sample12 F1=new sample12();      //1.create object of diff class
		F1.m1();                         //2.method call-->diff class objectname.methodname();
		F1.m2();
		F1.m1();
		
		
	}
	

}
