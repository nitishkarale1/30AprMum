package Use_of_static_non_static_global_variables;

public class sample2 
{
    public static void main(String[] args)
    {
	    student s1=new student();
	    s1.studentName="Nilesh";
	    s1.studentRollNum=51;
	  //s1.schoolPrincipal="ABC sir";
	    student.schoolPrincipal="ABC sir";
	    
	    student s2=new student();
	    s2.studentName="Ajay";
	    s2.studentRollNum=52;
	  //s2.schoolPrincipal="ABC sir";
	    student.schoolPrincipal="ABC sir";
	    
	    student s3=new student();
	    s3.studentName="Priyanka";
	    s3.studentRollNum=53;
	  //s3.schoolPrincipal="ABC sir";
	    student.schoolPrincipal="ABC sir";
	    
	    student s4=new student();
	    s4.studentName="Snehal";
	    s4.studentRollNum=54;
	  //s4.schoolPrincipal="XYZ sir";
	    student.schoolPrincipal="XYZ sir";
	    
	    s1.studentInfo();
	    s2.studentInfo();
	    s3.studentInfo();
	    s4.studentInfo();
	    
	}
}
