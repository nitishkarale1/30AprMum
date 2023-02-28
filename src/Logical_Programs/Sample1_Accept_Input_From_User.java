package Logical_Programs;

import java.util.Scanner;

public class Sample1_Accept_Input_From_User 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter student name:  ");
	    String s1=scan.next();
		System.out.println("length: "+s1.length());
		
		System.out.println("enter num1: ");
		int num1=scan.nextInt();
		System.out.println("enter num2: ");
		int num2=scan.nextInt();
		System.out.println("Addition: "+(num1+num2));
	}
	
}
