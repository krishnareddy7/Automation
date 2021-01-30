package ratancolletions;

import java.util.ArrayList;

public class Test3 {

	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student(11, "krishna"));
		al.add(new Empclass(1, "reddy"));
		
	Student st=	(Student)al.get(0);
	System.out.println(st.sid+"  "+st.sname);
	
		Object in = al.get(1);
		if (in instanceof Empclass)
		{
		Empclass ec=(Empclass)in;
		System.out.println(ec.eid+"=="+ec.ename);
		
		} if(in instanceof Student) {
			 Student st1 =(Student)in;
			 System.out.println(st1.sid+"   "+st1.sname);
		}
	}
}
