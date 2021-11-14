package anonyINNERCLASSwithoutclass;

public class mainn {
public static void main(String[] args) {
	i1 oo=new i1()
			{

				@Override
				public int m2(int a,int b) {
					// TODO Auto-generated method stub
					int c=a+b;
				return c;
				}
		
			};
			int a=oo.m2(10, 8);
			System.out.println(a);
}
}
