package objclass;

public class ClassMethod {
	
	public void m1() {
	}
	public void m2() {
	}

	 ClassMethod() {}
	 ClassMethod(int i) {}

public static void main(String[] args) {
	
	ClassMethod cs=new ClassMethod();
	Class c = cs.getClass();
	System.out.println(c.getName());
	System.out.println(c.getDeclaredMethods());
	
}
			
			
}
	 
	


