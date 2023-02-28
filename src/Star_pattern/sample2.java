package Star_pattern;

public class sample2 
{
	//****
	//***
	//**
	//*
	
	public static void main(String[] args)
	{
		int star=4;
		for(int i=0; i<=4; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
}
