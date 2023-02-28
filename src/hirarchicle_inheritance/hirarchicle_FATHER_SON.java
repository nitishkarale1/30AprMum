package hirarchicle_inheritance;

public class hirarchicle_FATHER_SON 
{
	public static void main(String[] args) 
	{
		son1 A=new son1();  //features of sub class son1
		A.mobile();
		A.car();
		A.money();
		A.home();
		System.out.println("-------------------------");
		
		son2 B=new son2();   //features of sub class son2
		B.laptop();
		B.car();
		B.money();
		B.home();
		System.out.println("-------------------------");
		
		son3 C=new son3();   //features of sub class son3
		C.bike();
		C.car();
		C.money();
		C.home();
		System.out.println("-------------------------");
				
	}
}
