package Array;

public class Array1 {

	public static void main(String[] args) {
		// A B C D E
		//1.array declaration
		char grade[]=new char[5];
		
		//2.array initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		
		//3.USAGE
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println("*******************************");
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("***************************");
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	}

}
