package suppressedExceptions;

public class student implements AutoCloseable   {
student()
{
	System.out.println("student contructor");
}
public void close()throws Exception
{
	System.out.println("student Exception");

}
}
