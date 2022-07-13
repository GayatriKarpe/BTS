package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("velocity");
		ll.add('A');
		ll.add(123);
		ll.add("velocity");
		ll.add(null);
		ll.add(123.123);
		ll.add(null);
		ll.add(true);
		ll.add('B');
		
		System.out.println((ll.size()));
        System.out.println(ll.isEmpty());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll);
        System.out.println("************************");
     
        //1.using for loop
    	for(int i=0;i<=ll.size()-1;i++)
    	{
    		System.out.println(ll.get(i));
    	}
    	System.out.println("************************");
    	//2. using iterator
        Iterator it = ll.iterator();
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	System.out.println("************************");
    	
    	//3.using list iterator
           ListIterator li =ll.listIterator();
           while(li.hasNext())
       	{
       		System.out.println(li.next());
       	}
           System.out.println("************************");
           //reverse array
          while(li.hasPrevious())
          {
        	  System.out.println(li.previous());
          }
            System.out.println("************************");
           //3.using object
           //for(a)
           //for(:a)
           //for(v:a)
           //for(object v:a)
           
           for(Object lis:ll)
           {
        	   System.out.println(lis);
           }


	}

}
