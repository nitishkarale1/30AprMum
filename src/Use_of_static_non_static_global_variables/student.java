package Use_of_static_non_static_global_variables;

public class student 
{
	String studentName;
	int studentRollNum;
	//String schoolPrincipal;
	static String schoolPrincipal;
	
	public void studentInfo()
	{
		System.out.println(studentName+":"+studentRollNum+":"+schoolPrincipal);
	}
}
