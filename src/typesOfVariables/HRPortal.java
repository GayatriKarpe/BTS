package typesOfVariables;    //Employee info of class Employee

public class HRPortal {

	public static void main(String[] args) {
		Employee SachinT=new Employee(); //object created
		 SachinT.name="Sachin Tendulkar";
		 SachinT.dept="batting";
		 SachinT.id=10;
		 SachinT.grade='a';
		 SachinT.salary=20000.50f;
		 SachinT.empInfo();
		 
		 
		 Employee virat=new Employee(); //object created
		 
		 virat.name="virat kohli";
		 virat.dept="batting";
		 virat.id=19;
		 virat.grade='A';
		 virat.salary=52000.50f;
		 virat.empInfo();
		 
		
		 
	}

}
