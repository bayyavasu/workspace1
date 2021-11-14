package funcref1;

public class A {
public static void main(String[] args) {
	i i1=new A()  :: mmm;
	i1.m1();
	i i2= A ::c;
	i2.m1();
}
public void mmm()
{
	System.out.println("vasu");
}
public static void c()
{
	System.out.println("vasu");
}
}

interface i
{
	public void m1();
}
