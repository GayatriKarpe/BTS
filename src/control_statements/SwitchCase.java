package control_statements;

public class SwitchCase {

	public static void main(String[] args) {
		//1--> Welcome to 1st year engg
        //2--> Welcome to 2nd year engg
		//3--> Welcome to 3rd year engg
		//4--> Welcome to 4th year engg
		
		int year=2;
		
		switch(year)
		{
		case 1:System.out.println("welcome to 1st year engg");
		break;
		
		case 2:System.out.println("welcome to 2nd year engg");
		break;
		
		case 3:System.out.println("welcome to 3rd year engg");
		break;
		
		case 4:System.out.println("welcome to 4th year engg");
		break;
		
		default:System.out.println("enter year between 1-4");
		break;
		}
	}

}
