package Accessspec_Study;

import Accessspecifiers.Velocity; //have to write package name.class name which we have to extend

public class Test2 extends Velocity
{
   public static void main(String[] args) 
  {
	
	   Test2 ts=new Test2();
		ts.test3();  //after using extend we call protected method in another class
		ts.test4(); ///calling public method-->visible througout project
  }
}
