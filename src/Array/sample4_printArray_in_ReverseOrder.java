package Array;

public class sample4_printArray_in_ReverseOrder 
{
	public static void main(String[] args)
	{
		 int [] ar=new int [5];
		 
		 ar[0]=50;
		 ar[1]=30;
		 ar[2]=10;
		 ar[3]=40;
		 ar[4]=20;
		 
		 System.out.println(ar.length);
		 
//		 for(int i=4; i>=0; i--)
//		 {
//			 System.out.println(ar[i]);
//		 }
		 
		 for(int i=ar.length-1; i>=0; i--)
		 {
			 System.out.println(ar[i]);
		 }
	}

}
