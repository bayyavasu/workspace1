		package feb28;

public class getobjectofpoly {

public guest getobject(String str)
{
	 if(str.equals("man"))
	 {		
	return new man();
	 }
	 else if(str.equals("fish"))
	 {
	return new fish();
	 }
	 else
	 {
	return new bird();
	 }

}
}
