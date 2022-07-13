package LogicalPrograms;

import java.util.Scanner;

public class multiplicationWithoutOperator {

	public static void main(String[] args) {
      //5*4
		//5+5+5+5
		
		int sum=0;
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter no a");
	        int a = sc.nextInt();
	        
	        System.out.println("Enter no b");
	        int b = sc.nextInt();
	        
	        for(int i=1;i<=b;i++)//1-->2
	        {
	        	sum=sum+a;//0+5-->5,5+5-->10,
	        }
	        System.out.println("multiplication is "+sum);
	}


}
