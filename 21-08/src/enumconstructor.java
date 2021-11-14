
public enum enumconstructor {
sun("sunday"){
	public int getproductivity()
	{
		return 5;
	}
},mon("monday")
{
	public int getproductivity()
	{
		return 55;
	}
},tue("tuesday"),wed("wednesday"),thurs("thursday"),fri("friday"),sat("saturday");

	private String value;
	private enumconstructor(String s)
{
		this.value=s;
	System.out.println(value);
}
	
	public String getvalue()
	{
		return this.value; 
	}
	public int getproductivity()
	{
		return 9;
	}

public static void main(String[] args) {
	System.out.println(enumconstructor.sun.getvalue());

	System.out.println(enumconstructor.sun.getproductivity());
}
}
