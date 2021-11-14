import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	List<Employee> empList=UtilityClass.getEmployeeInfo();
	empList.stream().forEach(emp -> System.out.println(emp));
	System.out.println("========Stream count=========");
	System.out.println(empList.stream().count());
	System.out.println("=========stream filter ============");
	empList.stream().filter(e->e.getId()%2==0).forEach(e->System.out.println(e));
	System.out.println("=======optional==========");
	System.out.println("======findAny============");
	Optional<Employee> ee=empList.stream().findAny();
	if(ee.isPresent())
	{
		System.out.println(ee.get().getName());
	}
	System.out.println("======findFirst=============");
	Optional<Employee> ee2=empList.stream().findFirst();
	if(ee2.isPresent())
	{
		System.out.println(ee.get().getName());
	}
	System.out.println("==========anyMatch================");
	boolean val=empList.stream().anyMatch(v->v.getName().equals("mani"));
	System.out.println(val);
	System.out.println("==========allMatch================");
	boolean val1=empList.stream().allMatch(n->n.getName().startsWith("v"));
	System.out.println(val1);
	empList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()));
	System.out.println("============making a new list==============");
	List<Employee> ageEmp=empList.stream().filter(e->e.getAge()>3).collect(Collectors.toList());
	System.out.println(ageEmp);
		System.out.println("======IntStreamTest===========");
		intStreamTest ist=new intStreamTest();
		ist.intstream();
		System.out.println("=======making sal list=====");
		Function<Employee,Employee> r=(newBonus->
		{newBonus.setEmpSal(newBonus.getEmpSal()+5000);
		return newBonus;
		});
		List<Employee> salEmp=	empList.stream().map(r).collect(Collectors.toList());
		salEmp.forEach(p->System.out.println(p.getEmpSal()));
		System.out.println("=========convertinga anew list using map female account list");
		
		List<Long> femaleActList=empList.stream().filter(s->s.getGender().equals("female"))
		.map(ac->ac.getAccount().getActNumber()).collect(Collectors.toList());
		femaleActList.forEach(a->System.out.println(a));
		empList.stream().sorted((a,b)->b.getAccount().getBankName().compareTo(a.getAccount().getBankName())).
		forEach(bankName->System.out.println(bankName.getAccount().getBankName()));
}
}