package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class gethibconnection {
public static Session getSession()
{
	Configuration con=new Configuration();
	con.configure();
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	return s;
}
}
