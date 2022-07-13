package LogicalPrograms;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
		
		//10%2----->remainder 0 
		//10/2---->5
		
		System.out.println("Enter no");
	       Scanner sc=new Scanner(System.in);
	        int a = sc.nextInt();
	     if(a%2==0)
	     {
	    	 System.out.println("given no is even no");
	     }
	     else
	     {
	    	 System.out.println("given no is odd no");
	     }
	}

}
