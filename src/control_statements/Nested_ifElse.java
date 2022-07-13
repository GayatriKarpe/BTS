package control_statements;

public class Nested_ifElse {

	public static void main(String[] args) {
		//if un is valid -->enter password
		//if pwd is valid-->login success
		//else pwd is invalid-->incorrect password
		//else un is invalid-->incorrect un
		
		String UN="Gayatri";
		String PWD="Gayatri123";
	    
		if(UN=="Gayatri") //outer loop
		{
	    	System.out.println("enter password");			
		
		if(PWD=="Gayatri12")//inner loop
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("incorrect password");
		}
		}
		
		else
		{
			System.out.println("incorrect user name");
		}
	}

}
