package Use_of_static_non_static_global_variables;

public class employee 
{
      String employeeName;
      int employeeID;
      static String employeeManager;
      //String employeeManager;
      
      public void employee_Info()
      {
    	  System.out.println(employeeName+": "+employeeID+": "+employeeManager);
      }
	
}
