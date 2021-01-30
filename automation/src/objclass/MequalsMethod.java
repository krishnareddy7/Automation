package objclass;

public class MequalsMethod {
	
	int number;
	MequalsMethod (int number)
	{
		this.number=number;
	}
	
public static void main(String[] args) {
	
	MequalsMethod m1= new MequalsMethod(450);
	MequalsMethod m2= new MequalsMethod(450);
	System.out.println(m1.equals(m2));//content
	System.out.println(m1==m2);//address
	
	MequalsMethod m3= new MequalsMethod(450);
	MequalsMethod m4= new MequalsMethod(450);
	
	System.out.println(m3.equals(m4));//content
	System.out.println(m3==m4);//address
}


@Override
public boolean equals(Object obj) {
	int n1=this.number;// first method
	MequalsMethod m5=(MequalsMethod)obj;
	int n2=m5.number;//second method
	return n1==n2;
}
}
