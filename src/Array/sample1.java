package Array;

public class sample1 
{
	public static void main(String[] args) 
	{
		//Array declaration
		int ar[]=new int[5];
		
		//Array initialization
		
		ar[0]=50;
		ar[1]=10;
		ar[2]=30;
		ar[3]=40;
		ar[4]=20;
		
		//Array usage
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("--Print all data from int Array--");
//		
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
