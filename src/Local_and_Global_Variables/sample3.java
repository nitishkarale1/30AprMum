package Local_and_Global_Variables;

public class sample3 
{
	static int b=20;

	
 public static void main(String[] args) 
 {
	   //static global variable call from same class
	 System.out.println(b);
	 
	 //static global variable call from different class
	 System.out.println(sample4__.c);
	
}
 
 public static void m1()
 {
	 System.out.println(b);
 }
 
 public void m2()
 {
	 System.out.println(b);
 }
		
	
}
