package FinalKeyword;

public class Test
{
      int a=100;
      final int b=10;
      
	public static void main(String[] args) {
	 Test t=new Test();
	 t.add();
		
	}
        public void add()
        {
        	a=a+10;
        	System.out.println(a);
        //b=b+10;   we cant update value of final variable
        System.out.println(b);
        }
}
