package methods;  //here we study how to give parameter in methods in same class  //date:14/4/22

public class PuneUniversity {

	public static void main(String[] args) 
	{
		
		PuneUniversity pu=new PuneUniversity();  //created object for method StudentInfo 
		pu.StudentInfo(); //calling method without parameter
//======================================================================================================================			
		pu.StudentInfo("kajal"," PU3456"," bcom", 2,'B');  //method calling with parameters
		pu.StudentInfo("gayatri","PU567","bcs",3,'A');
	    pu.StudentInfo("leena","PU789","engg",4,'A');
	}
	
	public void StudentInfo()  //non static method ---->without parameter
	{
		//name, prnno ,course,year,grade
		
		String name="velocity";
		String prn="PU1243";
		String course="engg";
		int year=3;
		char grade='A';
		System.out.println("=============================");
		System.out.println("student name is "+name);
		System.out.println("student's prn no is "+prn);
		System.out.println("student course name is "+course);
		System.out.println("student is in the year "+year);
		System.out.println("student's grade is "+grade);
		System.out.println("==================================");
	}
//===================================================================================================================================
	
	public void StudentInfo(String name,String prn,String course,int year,char grade)  //nonstatic method with parameter
	{
		System.out.println("student name is "+name);
		System.out.println("student's prn no is "+prn);
		System.out.println("student course name is "+course);
		System.out.println("student is in the year "+year);
		System.out.println("student's grade is "+grade);
		
	}
}

