package waystocreatepackage;

import java.util.Optional;
import java.util.stream.Stream;

public class reduce {
public static void main1(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(10);
	Optional<Double> op=s1.reduce((a,b)->{
		return a+b;
	});
	System.out.println(op.get());
		
}

public static void main(String[] args) {
	Stream<Integer> s1=Stream.of(1,2,3,4);
	Optional<Integer> op=s1.reduce((a,b)->{
		System.out.println(a);
		System.out.println(b);

		return a+b;
		
	});
	System.out.println(op.get());
		
}
}
