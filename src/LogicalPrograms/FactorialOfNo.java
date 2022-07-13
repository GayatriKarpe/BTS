package LogicalPrograms;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		//4!=4*3*2*1
		System.out.println("Enter no");
	       Scanner sc=new Scanner(System.in);
	        int a = sc.nextInt();
		int b=1;
		for(int i=a;i>=1;i--)//4,3,2,1
		{
			b=b*i;  //4*1=4,4*3=12,12*2=24,24*1=24
		}
		System.out.println("Factorial of no "+b);
	}

}
