package control_statements;

public class Else_if_Test {

	public static void main(String[] args) {
		int marks=65;
		
		if(marks>=75 && marks<100)
		{
			System.out.println("you are in dist");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("you are in 1st class");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("you are in 2nd class");
			
		}
		else if(marks>=35 && marks<50)
		{
			System.out.println("you are in pass class");
		}
		else 
		{
			System.out.println("you are fail");
		}
	}

}
