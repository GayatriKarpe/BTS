package Polymorphism;

public class Overriding {

	public static void main(String[] args) {
		Father f=new Father();
		f.car();
		Father.money();
	System.out.println("*****************************");	
		Son s=new Son();
		s.car();
		Son.money();
	}

}
