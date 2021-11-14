package timedatetest;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class tdt {
public static void 	main(String[] args)
	{
		LocalDate ld=LocalDate.of(1998, 11, 12);
		System.out.println(ld);
		LocalDate lld=ld.plusDays(40);
		System.out.println(lld);


		LocalDate ld1=LocalDate.of(1998,Month.APRIL, 12);
		System.out.println(ld1);
		LocalDate ld2=LocalDate.now();
		System.out.println(ld2);
		
	String str="2020-08-13";
	LocalDate ld3=LocalDate.parse(str);
	System.out.println(str);
		boolean flag=ld3.isAfter(LocalDate.now());
		System.out.println(flag);

		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());

		LocalDate lddd=ld3.withDayOfYear(40);
		System.out.println(lddd);

		LocalDate ld5=ld.withMonth(10);
		System.out.println(ld5);
		Period p=Period.of(4, 3, 25);
				System.out.println(p);
				Period p2=Period.ofYears(4);
				System.out.println(p2);
		
	}

}
