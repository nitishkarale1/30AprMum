package Array;

public class sample10_multiDimentional_array
{
	public static void main(String[] args) 
	{
		//   0  1  2
		//0 10,20,30 
		//1 40,50,60
		
		int [][] A=new int [2][3];
		
		A[0][0] =10;
		A[0][1]=20;
		A[0][2]=30;
		A[1][0]=40;
		A[1][1]=50;
		A[1][2]=60;
		
		System.out.println(A[0][2]);
		
		System.out.println("----");
		
		for(int i=0; i<=1; i++)  //outer loop for rows
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}