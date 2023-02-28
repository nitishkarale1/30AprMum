package Logical_Programs;

public class sample58_0_to_1000_prime_no 
{
	public static void main(String[] args) 
	{
		int count=0;
		
		for(int i=1; i<=1000; i++)
		{
			for(int j=2; j<=i-1; j++)
			{
				if(i % j == 0)
				{
					count=count+1;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
			else
			{
				count=0;
			}
			
		}
		
	}
	
}
