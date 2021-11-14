package hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sqlcon {
	public Session getSession()
	{
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	
	SessionFactory sf = con.buildSessionFactory();
	Session s = sf.openSession();
	return s;
}
}
