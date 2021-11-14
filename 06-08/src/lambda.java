
public class lambda {
public static void main1(String[] args) {
	i1 a=()->{
		System.out.println("lambda exp");
	};
	a.m1();
}
}
interface i1
{
	public void  m1();
}