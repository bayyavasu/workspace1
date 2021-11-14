package impl;
import contract.operation;
public class outil {
	
	
public static operation getobject(String ope)
{
	operation op=null;
	if(ope.equals("add"))
			{
		op=new add();
			}
return op;
}

}
