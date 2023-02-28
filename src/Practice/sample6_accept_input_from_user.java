package Practice;

import java.util.Scanner;

public class sample6_accept_input_from_user 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1=A.nextInt();
		System.out.println("enter num2: ");
		int num2=A.nextInt();
		
		System.out.println("Multipliction:"+(num1*num2));
		System.out.println("Addition:"+(num1+num2));
	
	}
	
}
