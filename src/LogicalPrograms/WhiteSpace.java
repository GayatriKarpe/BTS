package LogicalPrograms;

public class WhiteSpace {

	public static void main(String[] args) {
		
		String a="P  U  N E";
		int Count=0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char mychar=a.charAt(i);
			if(mychar==' ')
			{
				Count++;
			}
		}
		System.out.println("no of white space "+Count);
	}

}
