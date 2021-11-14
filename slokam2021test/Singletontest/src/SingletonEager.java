
public class SingletonEager {
private static SingletonEager ref=null;
static
{
	ref=new SingletonEager();
//	providing field values  to the object(ref)
	
}
private SingletonEager()
{
	
}
public static SingletonEager getRef() {
	return ref;
}

	
	
}
