package Control_Statements;

public class sample33_nested_if 
{
	public static void main(String[] args) 
	{
		int PE=80;
		int ME=71;
		int INP=17;
		
		if (PE>=75)
		{
			System.out.println("PASS--->Eligible for ME-->PE>75");
			
			          if (ME>=70)
			          {
			        	  System.out.println("Got Selected-->ME>70");
			          }
			          
			          else
			          {
			        	  System.out.println("Rejected-->ME<70");
			          }
			          if (INP>=15)
			          {
			        	  System.out.println("Interview passed");
			          }
			          else
			          {
			        	  System.out.println("Not Cleraed");
			          }
		}
		
		else
		{
			System.out.println("Fail--->Not Eligible for ME-->PE<75");
		}
	}

}
