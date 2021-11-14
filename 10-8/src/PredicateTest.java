import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.Date;

public class PredicateTest {
public static void main(String[] args) {
	/*Predicate<Integer> p=(i)->{
		if(i<20) return true;
		else return false;
	};
	System.out.println(p.test(20));*/
/*	Predicate<LocalDate>  ld=PredicateTest :: ourmethod ;
	System.out.println(ld.test(LocalDate.now()));
}
public static boolean ourmethod(LocalDate localdate)
{
	return localdate.isAfter(LocalDate.now());
}*/
	Predicate<LocalDate>  ld=new PredicateTest() :: ourmethod ;
	System.out.println(ld.test(LocalDate.now()));
}
public  boolean ourmethod(LocalDate localdate)
{
	return localdate.isAfter(LocalDate.now());

}
}