package Use_of_static_non_static_global_variables;

public class sample5 
{
    public static void main(String[] args) 
    {
	    employee e1=new employee();
	    e1.employeeName="Atul";
	    e1.employeeID=108;
	    employee.employeeManager="Parag";
	    //e1.employeeManager="Parag";
	    
	    employee e2=new employee();
	    e2.employeeName="pranay";
	    e2.employeeID=205;
	    employee.employeeManager="Anurag";
	    //e2.employeeManager="Anurag";
	    
	    employee e3=new employee();
	    e3.employeeName="Akash";
	    e3.employeeID=411;
	    employee.employeeManager="Abhimanyu";
	    //e3.employeeManager="Abhimanyu";
	    
	    e1.employee_Info();
	    System.out.println("----------------------");
	    
	    e2.employee_Info();
	    System.out.println("----------------------");
	    
	    e3.employee_Info();
	    System.out.println("----------------------");
	    
    	
    	
    	
    	
	}
}
