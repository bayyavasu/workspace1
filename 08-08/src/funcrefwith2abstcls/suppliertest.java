package funcrefwith2abstcls;

import java.util.function.Supplier;

public class suppliertest {
public static void main(String[] args) {
	Supplier<String> s=()->{
		return "vasu";
	};
	System.out.println(s.get());
	Supplier<Integer> s1=	suppliertest::getsomevalue;
	System.out.println(s1.get());
}
public static int getsomevalue()
{
	return 11;
}
}
