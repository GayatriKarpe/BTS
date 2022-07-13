package Array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int rollno[]= {6,4,2,3,1,5,7};  //declaration+initialization
		//usage
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("-*******************************");
		
		Arrays.sort(rollno);  //have to import method by clicking on Arrays
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("********************");
		for(int i=rollno.length-1;i>=0;i--)
		{
			System.out.println(rollno[i]);
		}
	}

}
