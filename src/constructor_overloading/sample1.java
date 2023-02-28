package constructor_overloading;

public class sample1 
{
      int M;
      int N;
      int O;
      String ad;
      
      //example of constructor overloading
      private sample1()   //constructor without parameter
      {
    	  M=10;
    	  N=20;
    	  O=9;
    	  ad="Addition";
      }
      
      sample1( String p,int m, int n, int o)  //constructor with parameter
      {
    	  M=m;   //assign local variable value to global variable
    	  N=n;
    	  O=o;
    	 ad=p;
   
      }
      
      
      public void addition()
      {
    	  System.out.println((ad+"=")+(M+N+O));
    	 
    	  
      }
      
      public static void main(String[] args) 
      {
		  sample1 s1=new sample1();
		  s1.addition();
		  
		  
		  sample1 s2=new sample1("Addition",5,5,6); 
		  s2.addition();
		  
		  
	  }
}
