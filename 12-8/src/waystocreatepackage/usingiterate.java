package waystocreatepackage;

import java.util.stream.Stream;

public class usingiterate {
public static void main(String[] args) {
	Stream s1=Stream.iterate(1,a->a+2).limit(10);
	s1.forEach(System.out::println);
}
}
