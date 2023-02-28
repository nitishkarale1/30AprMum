package Logical_Programs;

public class sample55_0_to_100_prime_no 
{
	public static void main(String[] args) 
	{
		int num=0;
		//           2<=100
		for(int i=2; i<=100; i++)
		{
			//           2<=2-1
			for(int j=2; j<=i-1; j++)
			{
				if(i % j==0)
				{
					num++;
				}
	
			}
			if(num==0)
			{
				System.out.println(i);
			}
			else
			{
				num=0;
			}
			
		}
	}
	
}
