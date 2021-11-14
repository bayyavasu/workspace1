package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deletedao {
public void del()
{
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	org.hibernate.Transaction t=s.beginTransaction();
	emp e=(emp) s.load(emp.class, 1);
	s.delete(e);
	
	t.commit();
	s.close();

}
}
