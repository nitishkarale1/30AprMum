package Logical_Programs;

import java.util.Scanner;

public class Sample2_Accept_Input_From_User 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter Name: ");
		String a1= scan.next();
		
		System.out.println(a1.length());

		System.out.println("Enter num1: ");
		int num1=scan.nextInt();
		System.out.println("Enter num2: ");
		int num2=scan.nextInt();
		System.out.println("Addition: "+(num1+num2));
		
	}
}
