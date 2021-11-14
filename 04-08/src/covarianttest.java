
public class covarianttest {
public emp test(int i)////below class return type
{
	emp p=new emp();
	return p;
}
}
class cc extends covarianttest
{
	public manager test(int i) {//below subclass return type
		return null;
	}
}
class emp
{
	
}
class manager extends emp
{
	
}