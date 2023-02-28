package Logical_Programs;

import java.util.Scanner;

public class Sample3_Accept_Input_From_User 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String A=scan.next();
		System.out.println("length: "+A.length());
		
		System.out.println("----------------");
		
		System.out.print("Enter Num1: ");
		int Num1=scan.nextInt();
		System.out.println("Enter Num2: ");
		int Num2=scan.nextInt();
	    System.out.println("Addition: "+(Num1+Num2));
	   
	   System.out.println("----------------");
	   
	   System.out.println("Enter Num3: ");
	   int Num3=scan.nextInt();
	   System.out.println("EnterNum4: ");
	   int Num4=scan.nextInt();
	   System.out.println("Multiplication: "+(Num3*Num4));
	   
	   System.out.println("----------------");
	   
	   
	   
	}
	
}
