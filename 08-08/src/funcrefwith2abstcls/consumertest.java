package funcrefwith2abstcls;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class consumertest {
	public static void main(String[] args) {
		Consumer<String> s=(s1)->{
			System.out.println(s1);
		};
		s.accept("vasu");
		
	}

	
}
