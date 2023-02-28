package Practice;

import java.util.Scanner;

public class sample2_accept_input_from_user 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Name1: ");
		
		String s1=A.next();
		
		System.out.println("Enter Name2: ");
		String s2=A.next();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(3)==s2.charAt(3));
		System.out.println("-------------");
		
		System.out.println("Enter num1: ");
		int x=A.nextInt();
		
		System.out.println("Enter num2: ");
		int y=A.nextInt();
		
		System.out.println("Multiplication: "+(x*y));
		
		
//		String A=new String("nitish");
//		String B="nitish";
//		String C="nitish";
//		System.out.println(B==A);
//		System.out.println(B==C);
//		System.out.println(A.equals(C));
//		
	}
}
