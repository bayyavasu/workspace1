import java.util.stream.Stream;

public class sss {
// aim: age between 20-50 
public static void main(String[] args) {
	Stream<Integer> s1=Stream.of(1,51,2,3,52,6,58,41,2,36,5,41,2,3,9,8,4,1,2,6,58,4,22,33,44,55,26,5,4);
s1.filter((i)->{
	if(i>=20 && i<50)
return true;
	else return false;
}).forEach(System.out::println);

} 


}
