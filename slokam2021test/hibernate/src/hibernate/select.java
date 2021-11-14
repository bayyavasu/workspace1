package hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class select {
	public void getall() {
		Configuration c = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		String hqlqu = "from emp";
		org.hibernate.Query q = s.createQuery(hqlqu);
		List<emp> l = q.list();
		Iterator<emp> i = q.iterate();
		while (i.hasNext()) {
			emp e = i.next();
			System.out.print(e.getId());
			System.out.print(e.getName());
			System.out.print(e.getAge());
			System.out.print(e.getSalary());
			System.out.print(e.getDesignation());
			System.out.println();
		}
	}
}
