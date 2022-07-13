package Array;

public class SplitMethod {

	public static void main(String[] args) {
		String s="Gaytri Eknath Karpe";
		
		String[] output=s.split(" ");
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
		System.out.println("*************************************");
		 
		String s1="Velocity corporate training centre";
		String[] output1=s1.split("r");
		for(int i=0;i<=output1.length-1;i++)
		{
			System.out.println(output1[i]);
		}
	}

}
