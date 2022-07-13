package Patterns;

public class StarBox {

	public static void main(String[] args) 
	{
		//*****  row-->3 column-->5
		//*****   always start with row outer loop
		//*****
		for(int i=1; i<=3; i++) // Outer for loop used for Rows
		 {
		 for(int j=1; j<=5; j++) // Inner Loop for Columns
		 {
		   System.out.print("*");
		 }
		   System.out.println();	
	}

	}
}
