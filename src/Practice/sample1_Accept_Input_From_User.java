package Practice;

import java.util.Scanner;

public class sample1_Accept_Input_From_User
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  //
		System.out.println("Enter Num1: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("Addition: " + (num1+num2+num3));
	}
	
}
