package Logical_Programs;

public class sample54_count_duplicate_value_from_int_type_array 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [] {1,2,2,3,4,4,5};
		
		for(int i=0; i<=ar.length-1; i++)
		{
			for(int j=i+1; j<=ar.length-1; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
				
			}
			
			
		}
		
	}               
	
}




















