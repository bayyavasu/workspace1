import java.time.LocalDate;
import java.util.function.Predicate;

public class predicate {
public static void main(String[] args) {
	Predicate<Integer> p=(i)->{
		if(i<20)
		
			return true;
		else return false;
	};

System.out.println(p.test(50));


Predicate<LocalDate> ld=new predicate() :: ourmethod;
System.out.println(ld.test(LocalDate.now()));
}
public boolean ourmethod(LocalDate localdate)
{
	return localdate.isAfter(LocalDate.now());
}


}
