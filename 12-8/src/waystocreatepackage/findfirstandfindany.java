package waystocreatepackage;

import java.util.Optional;
import java.util.stream.Stream;

public class findfirstandfindany {
	public static void main1(String[] args) {
		
	
	Stream<Double> s1=Stream.generate(Math::random).limit(10);
	Optional<Double> op=s1.findFirst();
	System.out.println(op.get());
		
}
	public static void main(String[] args) {
Stream<Double> s1=Stream.generate(Math::random).limit(10);
Optional<Double> op=s1.findAny();
System.out.println(op.get());

}
}
