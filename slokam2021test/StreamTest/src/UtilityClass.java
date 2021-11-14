import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilityClass {
public static List<Employee> getEmployeeInfo(){
	
List<Employee> empList=Arrays.asList(new Employee(1,"vasu",22,new Account(65641,"Iob","spl", new Mobile(63165,"jio")),3000,"male"),
		(new Employee(2,"female3",32,new Account(654239,"Axis","spl", new Mobile(7965,"jio")),3000,"female")),
		(new Employee(3,"female1",32,new Account(9847654,"Sbi","spl", new Mobile(7965,"jio")),3000,"female")),
		(new Employee(4,"female2",32,new Account(5154485,"Axis","spl", new Mobile(7965,"jio")),3000,"female")),
		(new Employee(5,"shiva",36,new Account(18462,"Sbi","hyd", new Mobile(3243,"jio")),5000,"male")));
	
	return empList;
}
}
