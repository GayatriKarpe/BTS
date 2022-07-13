package typesOfVariables;            //we add info of emp in HRPortal class

public class Employee 
{
      //name,id,department,salary,grade
	String name;
	int id;
	String dept;
	float salary;
	char grade;
	
	public void empInfo()
	{
		System.out.println("*******************************************");
		System.out.println("employee name is "+name);	
		System.out.println("employee id is "+id);	
		System.out.println("employee department is "+dept);	
		System.out.println("employee salary is "+salary);	
		System.out.println("employee grade is "+grade);	
		System.out.println("*********************************************");	

       }

}
