package functionaltest;

import java.util.function.BiPredicate;

public class Bipredicatetest implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		return t+u>10;
	}
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> c=new Bipredicatetest();
		System.out.println(c.test(5, 6));
		BiPredicate<Integer, Integer> s=(a,b)->{
			int d=a+b;
			return d>5;
		};
		System.out.println(s.test(5, 1));
		
	}

}
