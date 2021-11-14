package suppressedExceptions;

public class tryWithResourse{
public static void main(String[] args) {
	try(student s=new student();
	   marks m =new marks();
			){
		System.out.println("try block");
	}catch(Exception e)
	{
		System.out.println("catch block");
		System.out.println(e.getSuppressed().length);
		System.out.println(e.getCause());
	}     
}
}
