package supertest;

public class B extends A {
	public B() {
		super(); // providing super is not mandatory by default it class super class constructors
		System.out.println("In Class B");
	}

	public B(int a) {
		
		System.out.println(a);

	}
}