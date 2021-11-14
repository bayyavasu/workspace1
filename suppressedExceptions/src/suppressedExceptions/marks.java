package suppressedExceptions;

import java.io.FileNotFoundException;

public class marks implements AutoCloseable {
marks()
{
	System.out.println("marks contructor");
}
public void close()throws Exception
{
	System.out.println("marks Exception");
	throw new FileNotFoundException();
	
}
}
