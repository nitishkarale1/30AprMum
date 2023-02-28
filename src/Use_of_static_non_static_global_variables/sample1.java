package Use_of_static_non_static_global_variables;

public class sample1 
{
	public static void main(String[] args)
	{
		
	
    sample_Emp e1=new sample_Emp();
     e1.empName="Rahul";
     e1.empID=101;
   //e1.empCEOname="abc";
     sample_Emp.empCEOname="abc";
     
     sample_Emp e2=new sample_Emp();
     e2.empName="Ganesh";
     e2.empID=102;
   //e2.empCEOname="abc";
     sample_Emp.empCEOname="abc";
     
     sample_Emp e3=new sample_Emp();
     e3.empName="Atul";
     e3.empID=103;
  // e3.empCEOname="xyz";
     sample_Emp.empCEOname="xyz";
     
     e1.show_info();
     e2.show_info();
     e3.show_info();
	}
}
