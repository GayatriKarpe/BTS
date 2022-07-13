package control_statements;

public class Else_if_study 
  {
	public static void main(String[] args) {
		// if marks >=60--->you are in dist
		//else if marks>=50---->1st class
		//else if marks>=40--->pass class
		//else you are fail
            int marks=90;
            if(marks>=60)
            {
            	System.out.println("you are in distinction");
            
            }
            else if(marks>=50)
            {
            	System.out.println("you are in first class");
            	
            }
            else if(marks>=40)
            {
            	System.out.println("you are in pass class");
            	
            }
            else if(marks<40)        //we can also use only else here like in line 33
            {
            	System.out.println("you are fail");
            	
            }
            
            
            //else 
            //{
            	//System.out.println("you are in fail");
            	
            //}
            
	}

}
