package Practice;

import java.util.Scanner;

public class sample25_Accept_input_from_user 
{
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.println("enter name:");
		String B=A.next();
		System.out.println("enter name:");
		String C=A.next();
		
		System.out.println(B.equals(C));
	}
}
