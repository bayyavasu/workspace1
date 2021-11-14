import java.util.Locale;
import java.util.ResourceBundle;

public class localeusingmethod {
public static void main(String[] args) {
	 System.out.println(returnkeyvalue("en","key1","slokam"));	
}
 static public String returnkeyvalue(String localename,String keyname,String basename) {
	Locale locale=new Locale(localename);
	ResourceBundle rb=ResourceBundle.getBundle(basename,locale);
	return rb.getString(keyname);
	
}
}
