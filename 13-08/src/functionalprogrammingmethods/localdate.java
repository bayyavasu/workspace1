package functionalprogrammingmethods;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class localdate {
	
	
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(12,5,8,6,7);
		List<Integer> list2=Arrays.asList(15,35,41,47);
		List<Integer> list3=Arrays.asList(12,54,87,26,17);
		List<Integer> list4=Arrays.asList(128,55,88,66,77);
	
	
	Stream<List<Integer>>  s=Stream.of(list1,list2,list3,list4);
	                                      /*s.forEach((l)->{   //printing list elements
		                                   for(Integer i:l)
		                                      {
			                                System.out.println(i);
                                           		}
	                                          });*/
	
	    s.flatMap(l->l.stream() ).sorted(). ///combining  all  lists into single stream
	    		forEach(System.out::println);
	
	}
public static void main1(String[] args) {
	Stream<LocalDate> ld=Stream.of(LocalDate.now(),
			LocalDate.of(2020, 10, 30),
			LocalDate.of(2020, 9, 30),
			LocalDate.of(2020, 8, 30),
			LocalDate.of(2020, 07, 30),
			LocalDate.of(2020, 06, 30));
	
ld.limit(5).skip(1).distinct().filter((d)->{
return d.isAfter(LocalDate.of(2020, 9, 29));
}).map((d)->{
	return d.plusDays(10);
}).forEach(System.out::println);

}
}
