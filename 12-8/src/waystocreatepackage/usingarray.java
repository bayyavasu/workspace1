package waystocreatepackage;

import java.util.Arrays;
import java.util.stream.Stream;

public class usingarray {
public static void main(String[] args) {
	Integer[] arr=new Integer[3];
	arr[0]=15;
	arr[1]=22;
	arr[2]=62;
	Stream<Integer> s1=Arrays.asList(arr).stream();
	s1.forEach(System.out::println);
}
}
