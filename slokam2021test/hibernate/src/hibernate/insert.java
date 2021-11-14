package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insert {
	public void insertt() {
		Configuration c = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Transaction t=s.beginTransaction();
		emp e1=new emp();
		e1.setId(2);
		e1.setName("mani");
		e1.setAge(23);
		e1.setSalary(40000);
		e1.setDesignation("hr");
		s.save(e1);
		t.commit();sf.close();
	}
}
