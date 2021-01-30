 package ratancolletions;

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylistex {
	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<Object>();
		al.add(10);
		al.add(10.5);
		al.add("krishna");
		al.add('a');
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.toString());
		
		//at 1.4 version
		
		ArrayList<Comparable> al1= new ArrayList<Comparable>();
		al1.add(Integer.valueOf(10));
		al1.add(Double.valueOf(10.5));
		al1.add("krishna");
		al1.add(Character.valueOf('k'));
		al1.add(null);
		al1.add(Integer.valueOf(10));
		
		System.out.println(al1);
		
	}  

}
