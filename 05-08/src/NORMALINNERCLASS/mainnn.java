package NORMALINNERCLASS;

public class mainnn {
public static void main(String[] args) {
	A a =new A();
	
	A.B b=new A().new B();
	A.B b1=a.new B();
	
	b.m1();
		b1.m1();	
}
}
