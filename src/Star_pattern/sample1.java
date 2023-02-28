package Star_pattern;

public class sample1 
{
    //***
	//**
	//*
	
	public static void main(String[] args) 
	{
		int star=3;
		
		for(int i=1; i<=3; i++)  //outer for loop for rows
		{
			for(int j=1; j<=star; j++)  //inner for loop fpr columns
 			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
	
}
