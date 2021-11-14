package calculation;

public class healper  {
public void doOperation(String op,int a,int b)
{ 
	calc c=null;
	if(op.equalsIgnoreCase("add"))
	{
     c= new add();
     c.arith(a,b);
	}
	else if(op.equalsIgnoreCase("sub"))
	{
     c= new sub();
     c.arith(a, b);
	}
	else if(op.equalsIgnoreCase("mul"))
	{
     c= new mul();
     c.arith(a, b);
	}
	else if(op.equalsIgnoreCase("div"))
	{
     c= new div();
     c.arith(a, b);
	}
	else
	{
		System.out.println("enter proper operation");
	}
	
}
}
