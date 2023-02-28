package Logical_Programs;

public class sample60_ArmStrong_Number 
{
	public static void main(String[] args)
	{
		int num=153;
		int sum=0; //27 + 125 + 1
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i % 10;
			sum=sum+(rem*rem*rem);
		}
		
		if(num==sum)
		{
			System.out.println("given no." +num+ " is a ArmStrong no.");
		}
		else
		{
			System.out.println("given no."+num+" is not a ArmStrong no.");
		}
	}
	
}
