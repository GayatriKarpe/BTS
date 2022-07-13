package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add("pune");      //random input string
		ls.add("pune");
		ls.add(null);
		ls.add(null);
		ls.add(123);
		ls.add(12.21);
		ls.add(true);
		ls.add('A');
		
		System.out.println(ls);
		
		//2. using iterator
        Iterator it = ls.iterator();
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	System.out.println("************************");
    	//3. for each
    	 for(Object l:ls)
         {
      	   System.out.println(l);
         }

    //	 for(int i=0;i<=ls.size()-1;i++)
    	// {
    	//	 System.out.println(ls.);
    	// }
    		System.out.println("************************"); 
    	LinkedHashSet<Integer> ls1=new LinkedHashSet<Integer>();
    	ls1.add(60);    	 
    	ls1.add(20); 
    	ls1.add(90); 
    	ls1.add(30); 
    	ls1.add(25); 
    	ls1.add(56); 
    	ls1.add(11); 
    	ls1.add(20);    	
    	System.out.println(ls1);
    	 
	}

}
