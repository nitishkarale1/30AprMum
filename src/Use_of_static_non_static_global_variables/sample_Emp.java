package Use_of_static_non_static_global_variables;

public class sample_Emp 
{
	String empName;
	int  empID;
	//String empCEOname;
	static String empCEOname;
	
	
	public void show_info()
	{
		System.out.println(empName+":"+empID+":"+empCEOname);
	}
}
