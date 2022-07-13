package Array;

public class String_Array {

	public static void main(String[] args) {
		String name[]=new String[3];
		
		name[0]="Gayatri";
		name[1]="Eknath";
		name[2]="karpe";
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("***************************");
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}

}
