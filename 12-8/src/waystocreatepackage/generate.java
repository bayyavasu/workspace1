package waystocreatepackage;

import java.util.stream.Stream;

public class generate {
		public static void main(String[] args) {
	//	double d=Math.random();
		//System.out.println(d);
		Stream<Double> s=Stream.generate(Math :: random).limit(8);
		s.forEach(System.out::println);

	}

}
