package Logical_Programs;

public class sample18_Armstrong_num
{
	public static void main(String[] args) 
	{
		int A=407;
		
		int B=0;
		
		for(int i=A; i>0; i=i / 10)
		{
			int rem=i%10;
			B=B+(rem*rem*rem);
		}
		if(A==B)
		{
			System.out.println("given number "+ A + " is a Armstrong number");
		}
		else
		{
			System.out.println("given number " + A + " is a Armstrong number");
		}
	}
}
