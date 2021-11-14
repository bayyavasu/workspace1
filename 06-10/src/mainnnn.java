
public class mainnnn {
public static void main(String[] args) {
method( (v1,v2)->{ return v1+v2;	} );	

}
static int method(calc c)
{

return c.calc(10,20);	
}
}
interface calculator
{
	int calc();
}
