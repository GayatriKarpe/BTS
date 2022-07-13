package constructor;

public class DefaultConstructor {
	//public DefaultConstructor--->created by complier
	
	public void mul() {
		int a=3;
		int b=6;
		int c=a*b;
		System.out.println("multiplication is "+c);
	}

	public static void main(String[] args) {
		DefaultConstructor dc=new DefaultConstructor(); //created object of class
	             dc.mul();
	}

}
