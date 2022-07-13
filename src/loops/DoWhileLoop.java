package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		//good morning 5 times
		int a=1;
		do
		{
			System.out.println("Good Morning");
                a++;
		}
			while(a<=5);
 System.out.println("***************************************");
      
 //5's table in reverse order
           int i=50;
            do
            {
            	System.out.println(i);
            	i=i-5;
            }
            while(i>=5);
   System.out.println("***************************************"); 
         
   //20,s table 
   int p=20;
   do
   {
	   System.out.println(p);
	   p=p+20;
   }
   while(p<=200);
            
   System.out.println("***************************************");
   //18,s table in different way
        int v=1;
        int w=18;
        do
        {
        	System.out.println(v*w);
        	v++;
        }
        while(v<=10);
        
        System.out.println("***************************************");
        //table of 22 in reverse order
        int k=10;
        int j=22;
        do
        {
        	System.out.println(j*k);
        	k--;
        }
        while(k>=1);
    		
	}

	}


