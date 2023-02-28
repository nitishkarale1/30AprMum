package Logical_Programs;

public class sample4_Multiply_2_Num_Without_Multi_Operator 
{
	public static void main(String[] args) 
	{
		int A=45;
		int B=7;
		
		int sum=0;  
				//   7<=7
		for(int i=1; i<=B; i++)
		{
			sum=sum+A;     //45,90,135,180,225,265,315
		}
		
		System.out.println(sum);
		
	}

}
