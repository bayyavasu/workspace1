
public class calculator {
public int cal(int a,int b,openum operation)
{
	int result=0;
if(operation==openum.ADD)	
	result=a+b;
if(operation==openum.SUB)	
	result=a-b;
if(operation==openum.MUL)	
	result=a*b;
if(operation==openum.DIV)	
	result=a/b;
return result;
}
}
