package Methods1;

public class sample13 

{
	//non static regular method call from diff class
	
	public static void main(String[] args) 
	
	{
		sample14 Q=new sample14();   //object creation for different/another class
		
		Q.V();         //method call-->diff class objectname.methodname();             
		Q.V1();
		Q.V3();
		
	}

}
