package StringClassStudy;

public class StringUse {

	public static void main(String[] args) {
		String name="Gayatri";//without using new keyword
		String city= new String("Nashik");//with using new keyword
		
		//length() method use
		
		System.out.println(name.length());
		System.out.println(city.length());
		int output=name.length();//storing output in reference variable
		System.out.println("length of string "+output);
		
		System.out.println("**********************************");
		//touppercase() method use
		String a="gayatri";
		System.out.println(a.toUpperCase());
		String b=a.toUpperCase();
		System.out.println(b);

		System.out.println("**********************************");
		
		//tilowercase()
		String C="GAYATRI";
		System.out.println(C.toLowerCase());
	
	}

}
