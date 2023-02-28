package Control_Statements;

public class sample31_nested_if 
{
	public static void main(String[] args) 
	{
		int PE=68;
		int ME=70;
		
		if (PE>=60)    //condition
		{
			System.out.println("Pass-->Eligible for ME");
		
		
		      if (ME>=70)   //condition
		      {
			     System.out.println("Pass-->got Selected-->ME>=70");
		      }
		
		      else
	       	  {
		     	System.out.println("Rejected--ME<70");
		      }
			
		}
	
	    else
	    {
	    	System.out.println("Fail--not eligible for ME");
	    }
	}

}
