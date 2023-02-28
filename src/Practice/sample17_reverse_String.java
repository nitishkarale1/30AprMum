package Practice;

import java.util.Scanner;

public class sample17_reverse_String 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name:");
		
		String X=sc.next();

	    String Y="";
	    
		for(int a=X.length()-1; a>=0; a--)
		{
			Y=Y+X.charAt(a);
		}
		System.out.println(Y);
	}
}
