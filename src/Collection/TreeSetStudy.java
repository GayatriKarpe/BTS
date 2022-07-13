package Collection;

import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();  //take homogeneous records
		
		t.add(90);
	//	t.add("pune"); //show error
		t.add(60);
		t.add(320);
		t.add(63);
		//t.add(null); 
		t.add(92);
		t.add(43);
		t.add(90); //not take duplicate		
		System.out.println(t);
		
         System.out.println("************************");
         for(Object lis:t)
         {
      	   System.out.println(lis);
         }
         System.out.println("************************");
        java.util.Iterator<Integer> it=t.iterator();
        {
        	while(it.hasNext())
        	{
        		System.out.println(it.next());
        	}
        }
	}

}