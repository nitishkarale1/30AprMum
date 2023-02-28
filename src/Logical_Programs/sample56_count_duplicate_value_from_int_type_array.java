package Logical_Programs;

public class sample56_count_duplicate_value_from_int_type_array 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[] {1,2,3,4,2,7,8,8,3};
		//1<=8
		for(int i=0; i<=8; i++)
		{           //      2<=8
			for(int j=i+1; j<=8; j++)  //1
			{
				if(ar[i]==ar[j])     //2==3
				{
					System.out.println(ar[i]);
				}
				
			}
			
		}
		
	}
	
}
