package ratancolletions;

import java.util.ArrayList;

public class ArrayListex2 {
	
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student(1, "krishna"));
		al.add(new Student(2, "reddy"));
		al.add(10);
		al.add(null);
		al.add("krishna");
		for (Object obj:al) {
		if(obj instanceof Empclass)
		{
		Empclass em=(Empclass)obj;
		System.out.println(em.eid+"== "+em.ename); 
		}
			if(obj instanceof Student)
			{
			Student st=	(Student)obj;
			System.out.println(st.sid+"==="+st.sname);
			}
			if (obj instanceof Integer)
			{
				System.out.println(obj);
			}
			if (obj instanceof String)
			{
				System.out.println(obj);
			}
			if (obj==null)
				System.out.println(obj);
		}
		System.out.println(al);
	}

}
