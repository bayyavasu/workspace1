package waystocreatepackage;

import java.util.stream.Stream;
import java.util.Comparator;
import java.util.Optional;
public class optional {
public static void main(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(10);
	Optional<Double> op=s1.max(Double::compareTo);
	System.out.println(op.get());
	
}
public static void main1(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(10);
	Optional<Double> op=s1.min(Double::compareTo);
	System.out.println(op.get()); 
}
}
