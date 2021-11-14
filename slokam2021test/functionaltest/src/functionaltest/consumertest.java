package functionaltest;

import java.util.function.Consumer;

public class consumertest implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	public static void main(String[] args) {
		 Consumer<Integer> c=new  consumertest();
		 c.accept(5);
		 Consumer<Integer> s=a->System.out.println(a);
		 s.accept(8);
	}

}
