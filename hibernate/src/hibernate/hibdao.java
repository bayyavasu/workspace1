package hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibdao {
public void insert()
{
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	org.hibernate.Transaction t=s.beginTransaction();
	emp e=new emp();
	e.setId(101);e.setName("name101");e.setAge(101);
	s.save(e);
	
	t.commit();
	s.close();
}
}
