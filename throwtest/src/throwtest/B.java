package throwtest;
import java.io.FileNotFoundException;
public class B {
	public void test(int start,int end) throws Exception
	{
		String str="hello";
		if(start<0 | end<0 | end>4 | start<4 )
		{
			
			throw new FileNotFoundException();
		}
	
		
		
	}
}
