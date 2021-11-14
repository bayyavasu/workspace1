import java.util.Locale;
import java.util.ResourceBundle;

public class LOCALE{
public static void main(String[] args) {
	Locale locale=new Locale("en");
	ResourceBundle rb=ResourceBundle.getBundle("slokam",locale);
	System.out.println(rb.getString("key1"));
			
}
}
