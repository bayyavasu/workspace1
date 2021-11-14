import java.util.function.BinaryOperator;

public class binaryoptr {
public static void main(String[] args) {
	BinaryOperator<Integer> bo=(v1,v2)->{
		return v1+v2;
	};
	System.out.println(bo.apply(10,10));
}
}
