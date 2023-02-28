package constructor_overloading;

public class sample7 
{
   String First_Name;
   String Father_Name;
   String Mother_Name;
   String Surname;
   long Mo_Num;
   
   sample7()
   {
	  First_Name="Nitish";
	   Father_Name="Machhindranath";
	   Mother_Name="Vijaya";
	   Surname="Karale";
	   Mo_Num=9856567898l;
   }
   
   sample7(String a, String b, String c, String d, long g)
   {
	   First_Name=a;
	   Father_Name=b;
	   Mother_Name=c;
	   Surname=d;
	   Mo_Num=g;
   }
    
   public void My_Info()
   {
	   System.out.println("First Name: "+First_Name);
	   System.out.println("Father's Name: "+Father_Name);
	   System.out.println("Mother's Name: "+Mother_Name);
	   System.out.println("Surname: "+Surname);
	   System.out.println("Mo. Num: "+Mo_Num);
	
   }
   
   public static void main(String[] args) 
   {
	 sample7 A1=new sample7();
	 A1.My_Info();
	 
	 System.out.println("-------------------------------------------");
	 
	 sample7 A2=new sample7("Bhagyashri","Machhindranath", "Vijaya","Karale",9876543251l);
	 A2.My_Info();
   }
   
   
   
}
