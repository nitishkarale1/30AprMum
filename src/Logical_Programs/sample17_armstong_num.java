package Logical_Programs;

public class sample17_armstong_num 
{
	public static void main(String[] args) 
	{
		int orgnum=370;
		int sum=0;  //370
		                //37>0     37/10 = 3
		for(int i=orgnum; i>0; i=i/10)
		{
			int rem=i%10;  //3 % 10 = 3
			sum=sum+(rem*rem*rem);   //0+343+27 = 370
		}
		if(orgnum==sum)
		{
			System.out.println("given number " + orgnum+ " is armstrong number");
		}
		else
		{
			System.out.println("given number " + orgnum+ " is not armstrong number");
		}
	}
}
