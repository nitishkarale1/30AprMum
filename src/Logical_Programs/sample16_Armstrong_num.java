package Logical_Programs;

public class sample16_Armstrong_num
{
	public static void main(String[] args) 
	{
		int org=370; 
		
		int sum=0; 
		
		for(int i=org; i>0; i=i/10)
		{
			int rem=i % 10;
			
			sum=sum+(rem*rem*rem);
		}
		if(org==sum)
		{
			System.out.println("given number " + org+ " is a armstrong number");
		}
		else
		{
			System.out.println("given number " + org+ " is not a armstrong number");
		}
	}
}

