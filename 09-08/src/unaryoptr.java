import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class unaryoptr {
public static void main(String[] args) {
UnaryOperator<LocalDate> uo=(l1)->{
	return l1.plusDays(5);
};
LocalDate ll=uo.apply(LocalDate.now());
System.out.println(ll);

}

}
