package waystocreatepackage;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
public class usinglist {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("vasu");

list.add("om");
Stream<String>  s1= list.stream();
s1.forEach(System.out::println);
}

}
