package Accessspecifiers;

public class Pune {

	public static void main(String[] args) {
		Velocity V=new Velocity();
		//V.test1(); we can't call private members in another class
		
		V.test2(); //calling default method-->visible within package
        
		V.test3();//calling protected method-->visible only within package-->inheritance will provide out of class
		
		V.test4();//calling public method-->visible througout project
	}
		
	}


