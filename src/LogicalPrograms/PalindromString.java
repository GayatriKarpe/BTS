package LogicalPrograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
	       Scanner sc=new Scanner(System.in);
	       String a=sc.next();//original String
	       String b="";//blank string
	       for(int i=a.length()-1;i>=0;i--)
	       {
	    	   b=b+a.charAt(i);
	    	    }
	           System.out.println("original string "+a);
	           System.out.println("reverse string "+b);
    if(a.equals(b))
    {
    	System.out.println("String is palindrom");
    }
    else
    {
    	System.out.println("String is not palindrom");
    }
	}

}
