package ratancolletions;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {

		ArrayList<Empclass> al=new ArrayList<Empclass>();
		al.add(new Empclass(11, "krishna"));
		al.add(new Empclass(1212, "reddy"));
		
		for(Empclass emp:al)
		{
			System.out.println(emp.eid+"  "+emp.ename );
		}
	}

}
