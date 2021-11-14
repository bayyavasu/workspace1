import java.util.function.BiPredicate;

public class bipredicate {
public static void main(String[] args) {
	BiPredicate<Integer,Integer> bp=  bipredicate :: om;

System.out.println(bp.test(10, 20));
}


public static boolean om(Integer a1,Integer a2)
{
	if(a1<a2)
	return true;
	else return false;
	
}
}
