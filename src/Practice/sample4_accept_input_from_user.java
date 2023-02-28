package Practice;

import java.util.Scanner;


public class sample4_accept_input_from_user 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1:");
		int a=scan.nextInt();
		System.out.println("enter num2:");
		int b=scan.nextInt();

		System.out.println(a*b);
		
		System.out.println("enter name1:");
		String c=scan.next();
		System.out.println("enter name2");
		String d=scan.next();
		System.out.println(c.equals(d));
		System.out.println((c.charAt(2))==(d.charAt(2)));
	}
	
}