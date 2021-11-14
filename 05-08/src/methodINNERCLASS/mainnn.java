package methodINNERCLASS;

public class mainnn {
public static void main(String[] args) {
	m1();
}
public static void m1()
	{
		class B
		{
			public void test()
		{
		System.out.println("method inner class");
	}
		}
		B b=new B();
		b.test();
	}

}

