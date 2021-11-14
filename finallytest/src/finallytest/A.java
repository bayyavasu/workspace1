package finallytest;
import java.util.*;
public class A {
	public int  m2(int b)
	{
		int a;
		a=b+2;
		return a;
	}
	int g=m2(4);
	public static void main(String[] args)
	{
		
		try
		{
		A v=new A();

		System.out.println(v.m2(3));
		System.out.println(v.m2(3));
		
		}
	

finally
{
	A f=new A();
	System.out.println(f.m2(3));
	

}
	}
	int j=m2(5);	
	
}
	
