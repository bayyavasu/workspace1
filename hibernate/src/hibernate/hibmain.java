package hibernate;

public class hibmain {
public static void main(String[] args) {
	hibdao h=new hibdao();
	//h.insert();
	updatedao d=new  updatedao();
	//d.updatetable();
	deletedao  dell=new deletedao();
	//dell.del();
	select s=new select();
	s.selectt();
	System.out.println("done");
}
}
