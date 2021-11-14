package varargtest;

public class vararg {
public static void main(String[] args) {
	test(1,9,3,4,2);
	test2(true);
}
static void test(int... v)
{
	for (int i : v) {
		System.out.print(i);
	}
}
static void test2(boolean b,int... v)
{
	System.out.println(b);
}
}
