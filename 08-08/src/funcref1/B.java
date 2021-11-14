package funcref1;

public class B {
	public static void main(String[] args) {
		i11 i=B::mmm;
		System.out.println(i.m1(10,20));
		
		i11 a=(v1,v2)->{
			return v1+v2;
		};
		System.out.println(a.m1(10,20));

	}
	
	public static int mmm(int a,int b)
	{
 return a*b;
	}
	
	}

	interface i11
	{
		public int m1(int a,int b);
	}


