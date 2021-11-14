package anonyINNERCLASSwithobject;

public class mainn {
public static void main(String[] args) {
	student ss=new student();
	aaaa a=new aaaa()
			{

				@Override
				public void mrkscalc() {
					// TODO Auto-generated method stub
				System.out.println("anonymous");	
				}
		
			};
			ss.process(a);
}
}
