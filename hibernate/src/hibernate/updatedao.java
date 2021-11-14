package hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updatedao {
public void updatetable()
{
	Configuration con=new Configuration();
	con.configure();
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	emp e=(emp)s.load(emp.class, 3);
	org.hibernate.Transaction t=s.beginTransaction();
	
	e.setName("update1");
	e.setAge(55);
	s.saveOrUpdate(e);
	t.commit();s.close();
}
}
