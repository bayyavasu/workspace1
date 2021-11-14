import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class numberformattest {
	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
	public static void main2(String[] args) throws ParseException {
		NumberFormat nf=NumberFormat.getInstance();
		System.out.println(nf.parse("123456789v  cxx"));	
	}
public static void main1(String[] args) {
	NumberFormat nf=NumberFormat.getInstance(Locale.GERMAN);
	System.out.println(nf.format(123456789));
}
}
