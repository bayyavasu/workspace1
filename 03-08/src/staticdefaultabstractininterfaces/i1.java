package staticdefaultabstractininterfaces;

public interface i1 {
void m1();
static void statictest()
{
System.out.println("statictest");	
}
default  void deftest()
{
	System.out.println("default test");
}
	
	
}
