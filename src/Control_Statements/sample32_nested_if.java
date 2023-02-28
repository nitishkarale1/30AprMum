package Control_Statements;

public class sample32_nested_if 
{
	public static void main(String[] args) 
	{
		int PE=65;
		int ME=80;
		
		if (PE>=70)
		{
			System.out.println("PASS--->Eligible for ME-->PE>75");
		
		      
		      if (ME>=75)
		      {
		    	  System.out.println("Got Selected-->ME>80");
		      }
		      
		      else
		      {
		    	  System.out.println("Rejected--->ME<80");
		      }
        }
	
	    else
	    {
	    	System.out.println("Fail-->PE<70");
	    }
	}
}
