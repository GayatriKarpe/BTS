package StringClassStudy;

public class StringUse1 {

	public static void main(String[] args) 
	{
		//equal() method
		String a1="gayatri";
		String a2="gayatri";
		String a3=new String("gayatri");
		String a4=new String("gayatri");
		String a5=new String("Gayatri");
		//will compare memory location that will not compare string content
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a3==a4);
		
		//equal will compare content of string
		System.out.println("*************************");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		
		System.out.println("********************");
		System.out.println(a1.equals(a5));
		System.out.println(a1.equalsIgnoreCase(a5));
		
		System.out.println("===============================");
		//contain()
		String b1="Balraj";
		System.out.println(b1.contains("raj"));
		System.out.println(b1.contains("rj"));
		boolean result =b1.contains("raj");
		System.out.println("result is "+result);
		
		System.out.println("===============================");
		
		//isempty()
		String m="Nashik";
		String n="";
		String l="  ";
		//String o=null;
		
		//System.out.println(o.length());
		System.out.println(m.length());
		System.out.println(n.length());
		System.out.println(l.length());
		
		System.out.println(m.isEmpty());
		System.out.println(n.isEmpty());
		System.out.println(l.isEmpty());
		System.out.println("===============================");
		
		//blank
		System.out.println(m.isBlank());
		System.out.println(n.isBlank());
		System.out.println(l.isBlank());
		System.out.println("===============================");
		
		//charat 
		String c="india";
		System.out.println(c.charAt(4));
		System.out.println(c.charAt(0));
		char requiredChar=c.charAt(0);
		System.out.println(requiredChar);
		
		
	}

}
