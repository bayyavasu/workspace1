
public class RefImpl implements RefInterface {
	
public void printgreet()
{
	System.out.println("overriden method");
}
public void print()
{
	printgreet();
	
}
}
