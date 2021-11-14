
public class simple {
	int a;
	String name;
	simple()
	{
		System.out.println("constructoroverloading()");
	}
simple(int a)
	{
		this.a=a;
	}
	simple(int a,String name)
	{
		this.a=a;
		this.name=name;
		
	}
}
