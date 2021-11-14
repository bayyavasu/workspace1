package functionaltest;

import java.util.function.Predicate;

public class predicatetest implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
				return t>0;
	}
public static void main(String[] args) {
	Predicate<Integer> c=new predicatetest();
	System.out.println(c.test(5));
	Predicate<Integer> s=(t)->{
		return t<=8;
	};
	System.out.println(s.test(5));
	}
}

