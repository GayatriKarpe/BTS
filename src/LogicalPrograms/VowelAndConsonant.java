package LogicalPrograms;

import java.util.Scanner;

public class VowelAndConsonant {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{   
		int ccount=0;
		int vcount=0;
		 System.out.println("Enter String");
	       Scanner sc=new Scanner(System.in);
	       String a=sc.next();
	     
	    for(int i=0;i<=a.length()-1;i++)
	       {
	    	   char ch=a.charAt(i);
	    	   
	       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	       {
	    	
	    	   System.out.println(ch);
	    	   vcount++;
	    
	       }
	         
	       else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
	    		   
	       {
	    	     ccount++; 
	      }
	       
	       }
	    System.out.println("no of vowels are "+vcount);
	    System.out.println("no of consonants are "+ccount); 
	     
		}
	}

