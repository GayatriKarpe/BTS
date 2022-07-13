package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{
		//new ArrayList();
		//a=new ArrayList();
	ArrayList a = new ArrayList();
	a.add("velocity");
	a.add('A');
	a.add(123);
	a.add("velocity");
	a.add(null);
	a.add(123);
	a.add(null);
	a.add(true);
	
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(123));
	System.out.println(a.get(1));
	System.out.println(a.indexOf(123));
	System.out.println(a.lastIndexOf(123));
	System.out.println(a.remove(1));
	System.out.println(a);
	//1.using for loop
	for(int i=0;i<=a.size()-1;i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("************************");
	//2. using iterator
	//a.iterator
	//it=
	//Iterator
	Iterator it = a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("************************");
	//3.using list iterator
       ListIterator li = a.listIterator();
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
       
       for(Object v:a)
       {
    	   System.out.println(v);
       }
       System.out.println("************************");
       ArrayList<Integer> as = new ArrayList<Integer>();
       as.add(11);
       as.add(12);
       as.add(13);
       as.add(14);
       as.add(15);
       as.add(16);
       as.add(17);
       System.out.println(as);
       for(Integer w:as)
       {
    	   System.out.println(w);
       }
       
	}

}
