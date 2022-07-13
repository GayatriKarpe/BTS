package Accessspec_Study;

import Accessspecifiers.Velocity;//automatically generated after step1 //created object for calling public method

public class Test_specifier extends Velocity      //step3 inheritance class Velocity
{

	public static void main(String[] args)
	{ 
		//step1
		Velocity V=new Velocity();
		
		//V.test1();//we cant call private method-->visible only within class
		
		//V.test2();//we cant call default method-->visible within package
        
	//	V.test3();//we cant call protected method-->visible only within package-->inheritance will provide out of class
		
		V.test4();//calling public method-->visible througout project
		
System.out.println("************************************************************");
		
		//step4 -->object should created of subclass
		
		Test_specifier ts=new Test_specifier();
		ts.test3();  //after using extend we call protected method in another class
		ts.test4(); ///calling public method-->visible througout project
	}

}
