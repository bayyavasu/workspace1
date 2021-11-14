package statictest;

public class Maintest {
public static void main(String[] args) {
	A.a=20;
	System.out.println(A.a);
	A a1=new A();
	a1.b=5;
	System.out.println(a1.b);
	
}
}
