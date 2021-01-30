package ratancolletions;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
	   ArrayList al= new	ArrayList();
	   al.add(10);
	   al.add("krisjna");
	   al.add(1, "krishna");
	   al.set(2,10);
	   System.out.println(al.get(0));
	   al.remove("krishna");
	   System.out.println(al);
	}

}
