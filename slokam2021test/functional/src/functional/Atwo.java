package functional;

public interface Atwo {
	int abttwo();
	default void defone()
	{
		System.out.println("Atwo def");
	}
	static void statwo()
	{
		System.out.println("two static method");
	}
}
