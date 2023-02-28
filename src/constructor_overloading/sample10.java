package constructor_overloading;

public class sample10 
{
   float num1;
   float num2;
   int num3;
   int num4;
   int num5;
   
   sample10()
   {
	   num1=2.2f;
	   num2=3.3f;
	   num3=5;
	   num4=7;
	   num5=6;
   }
   
   sample10(float a, int b, int c)
   {
	   num1=a;
	   num3=b;
	   num4=c;
   }
   
   sample10(float d, int f)
   {
	   num2=d;
	   num5=f;
	   
   }
   
   public void addition()
   {
	   System.out.println(num1+num3+num2+num4+num5);
   }
   
    public static void main(String[] args) 
    {
	   sample10 V1=new sample10();
	   V1.addition();
	   
	   sample10 V2=new sample10(2.5f,2);
	   V2.addition();
	}
}
