package Practice;

import java.util.Scanner;

public class sample3_accept_input_from_user
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("enter name1: ");
		String S=A.next();
		
		System.out.println("enter name2: ");
		String T=A.next();
			
		System.out.println(S==T);
		System.out.println(T.toUpperCase());
	
			
	}
}
