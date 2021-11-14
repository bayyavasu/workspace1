package waystocreatepackage;

import java.util.stream.Stream;

public class allmatchandanymatch {
public static void main1(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(10);
	boolean b=s1.anyMatch(a->a>0.9);
	System.out.println(b);
}

public static void main2(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(5);
	//s1.forEach(System.out::println);
	boolean b=s1.allMatch(a->a<0.9);
	System.out.println(b);
}
public static void main(String[] args) {
	Stream<Double> s1=Stream.generate(Math::random).limit(5);
	//s1.forEach(System.out::println);
	boolean b=s1.noneMatch(a->a>1.0);
	System.out.println(b);
}

}
