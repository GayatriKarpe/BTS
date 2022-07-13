package control_statements;

public class Switch_Statement {

	public static void main(String[] args) {
		
		int day=7;

		switch(day)
		{
		      case 1:System.out.println("today is monday");
		      break;
		
		      case 2:System.out.println("today is tuesday");
				break;
				
		      case 3:System.out.println("today is wednesday");
				break;
				
		      case 4:System.out.println("today is thursday");
				break;
				
		      case 5:System.out.println("today is friday");
				break;
				
		      case 6:System.out.println("today is saturday");
				break;
				
		      case 7:System.out.println("today is sunday");
				break;
				
				default:System.out.println("enter value between 1-7");
				break;
		}

	}

}
