
public class LazySingleton {
	private static LazySingleton ref1=null;
private LazySingleton()
{
	
}
public synchronized static LazySingleton getRef1() {
	if(ref1==null)
	{
		ref1=new LazySingleton();
	}
	return ref1;
}




}
