package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class delete {
public void deletee()
{
	Configuration c = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf = c.buildSessionFactory();
	Session s = sf.openSession();
	org.hibernate.Transaction t=s.beginTransaction();
	emp e = (emp) s.load(emp.class, 1);
	s.delete(e);t.commit();
	sf.close();
	
}
}
