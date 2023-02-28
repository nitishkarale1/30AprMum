package Variable;

public class sample1 
{

	public static void main(String  [] args)

{
	//1. VAriable declaration (Allocating/Reserving memory)
	String studentName;     ///datatype variablename
	String studentDept;
	int studentRollNum;
	char studentGrade;
	float studentPer;
	
	
	//2. VAriable Initialization (Assigning or Inserting value)
	studentName = "Arjun";       //studentName= "Variable value"
	studentDept = "Electrical";
	studentRollNum = 101;
	studentGrade = 'A';
	studentPer = 65.5f;
	
	//3. Variable usage
	System.out.println(studentName);
	System.out.println(studentDept);
	System.out.println(studentRollNum);
	System.out.println(studentGrade);
	System.out.println(studentPer);

}

}