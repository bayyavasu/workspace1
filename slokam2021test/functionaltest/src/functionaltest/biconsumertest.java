package functionaltest;

import java.util.function.BiConsumer;

public class biconsumertest implements BiConsumer<Integer,Integer> {

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t+u);		
	}
	public static void main(String[] args) {
		 BiConsumer<Integer,Integer>  c=new biconsumertest();
		 c.accept(5, 9);
		 BiConsumer<Integer,Integer>  s=(a,b)->System.out.println(a+b);
	s.accept(5, 3);
	}

}
