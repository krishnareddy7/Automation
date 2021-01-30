package projectClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test 
{
public void posts(int num) 
{
	
	 ArrayList<Emp> al=new ArrayList<Emp> ();
	  al.add(new Emp(111, "krishna", "engineer"));	
	  al.add(new Emp(222, "ram", "doctor"));
	  al.add(new Emp(333, "lakshman", "lawer"));
	  al.add(new Emp(444, "ravan", "collector"));
	 al.add(new Emp(555, "venkat", "police"));
	  al.add(new Emp(666, "phani", "minister"));
	  
	  for (Emp a:al)
	  {
		  Collections.sort((List<T>) a);
//		  Arrays.
	    System.out.println(a.id+"--"+a.name+"--"+a.designation);
	  }
}


public static void main(String[] args) {
	Test t=new Test();
	t.posts(1);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String str="abc123xyz123abc";
//	 System.out.println(str.replace("123",""));
//	 System.out.println(str.replaceAll("[0-9]", ""));
//	str.split("abc");
//	
////        String str = "Java Exercises!";
////        System.out.println("Original String = " + str);
////        // Get the character at positions 0 and 10.
////        int index1 = str.indexOf("s",2);
////        char index2 = str.charAt(10);
////
////        // Print out the results.
////        System.out.println("The character at position 0 is " +
////            index1);
////        System.out.println("The character at position 10 is " +
////            index2);
////	

	

}

