package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		//vecto ctrl space import file option
		Vector v = new Vector();
		v.add("velocity");
		v.add('A');
		v.add(123);
		v.add("velocity");
		v.add(null);
		v.add(123);
		v.add(null);
		v.add(true);
		v.add('B');
		
		System.out.println(v);
		System.out.println(v.elementAt(1));
		System.out.println(v.size());
		System.out.println(v.contains(123));
		System.out.println(v.get(1));
		System.out.println(v.indexOf(123));
		System.out.println(v.lastIndexOf(123));
		//System.out.println(v.remove(3));
		System.out.println(v);
		System.out.println("************************");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************************");
		
		//1.using enumeration -->only use in vector not in arraylist
		//v.el--> right click-->choose enumeration 
		//ve -->corsor on ve chose first
		Enumeration ve = v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
	}

}
