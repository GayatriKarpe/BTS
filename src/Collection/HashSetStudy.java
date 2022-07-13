package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("pune");      //random input string
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);
		  Iterator it = hs.iterator();
	    	while(it.hasNext())
	    	{
	    		System.out.println(it.next());
	    	}
	    	System.out.println("************************");
	    	//3. for each
	    	 for(Object l:hs)
	         {
	      	   System.out.println(l);
	         }

	}

}
