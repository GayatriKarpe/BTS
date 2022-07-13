package StringClassStudy;

public class StringStudy {

	public static void main(String[] args)
	{
		String a1="gayatri";
		String a2="gayatri";
		String a3=new String("gayatri");
		String a4=new String("gayatri");
		
	//endwith
		
		System.out.println(a1.endsWith("ri"));
		System.out.println(a2.endsWith("Ri"));
		System.out.println("**********************************");
		
		//substirng
		String test="Gayatri Eknath Karpe";
		System.out.println(test.substring(7));
		System.out.println(test.substring(8, 14));
		System.out.println("**********************************");
	 
		//concat
		String x="pune";
		String y="city";
		System.out.println(x.concat(y));
		System.out.println(x.concat(" ").concat(y));
		System.out.println("**********************************");
		
		//index of
		System.out.println(a3.indexOf('y'));
		System.out.println(a4.indexOf('a',2)); //show index of next a
		System.out.println(a4.lastIndexOf('a'));
		System.out.println("**********************************");
		
		//replace
		String j="Automation Tasting";
		System.out.println(j.replace('t', 'm'));
		System.out.println(j.replace("Au","Sp"));
	}

}
