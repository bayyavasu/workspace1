package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class update {
	public void get() {
		Configuration c = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Transaction t=s.beginTransaction();
		emp e = (emp) s.load(emp.class, 1);
		e.setId(3);
		e.setName("vasu devarao");
		e.setAge(23);
		e.setSalary(90000);
		e.setDesignation("ceo");

		s.saveOrUpdate(e);
		t.commit();
		sf.close();
	}
}
