package constructor_overloading;

public class sample4 
{
	String S;
  // int S;
   int V;
   
   sample4()
   {
	   S="NK";
	   V=80;
   }
   
   sample4(String n, int m)
   {
	   S=n;
	   V=m;
   }
   
   public void division()
   {
	   System.out.println(V+S);
   }
   
   public void multiplication()
   {
	   System.out.println(S+V);
   }
   
   public static void main(String[] args) 
   {
	   sample4 t1=new sample4();
	   t1.division();
	   t1.multiplication();
	   
	   sample4 t2=new sample4("BK",120);
	   t2.multiplication();
	   t2.division();
   }
}
