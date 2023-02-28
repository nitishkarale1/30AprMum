package Logical_Programs;

public class demo_switch 
{
	public static void main(String[] args) 
	{
		int inp=8; 
		switch (inp) 
		 { 
		case 1: System.out.println("Today is mon: "); // 1 to 7 are the int inputs
		break; 
		 
		case 2: System.out.println("Today is tue: "); 
		break; 
		case 3: System.out.println("Today is wed: "); 
		break; 
		case 4: System.out.println("Today is thr: "); 
		break; 
		case 5: System.out.println("Today is fri: "); 
		break; 
		case 6: System.out.println("Today is sat: "); 
		break; 
		case 7: System.out.println("Today is sun: "); 
		break; 
		 
		default: System.out.println("wrong inputs"); 

		 }
	}
}
