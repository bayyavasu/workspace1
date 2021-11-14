package hib;

import java.util.Iterator;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class daohib {
	public void personpassport() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Transaction t = s.beginTransaction();
		person p = new person();
		
		p.setPname("slokam");
		p.setPage(65);
		passport pp = new passport();
		
		pp.setPpnumber("9ef");
		pp.setPed(2065);

		pp.setPers(p);
		p.setPt(pp);

		//s.save(pp);
		s.save(pp);
		t.commit();
		s.close();
		
	}
	public void updateorsave()
	{
		sqlcon sc=new sqlcon();
		Session s=sc.getSession();
		Transaction t=s.beginTransaction();
		person p=(person) s.load(person.class, 25);
		p.setPname("teya");
		p.setPage(21);
		passport pt=p.getPt();
		pt.setPed(2090);
		pt.setPpnumber("8688");
	s.saveOrUpdate(pt);
	t.commit();
	s.close();
		System.out.println("updated");
		
	}
	public void delete(){
		sqlcon sc=new sqlcon();
		Session s=sc.getSession();
		Transaction t=s.beginTransaction();
		person p=(person) s.load(person.class, 25);
		s.delete(p);
	t.commit();
	s.close();
		System.out.println("deleted");
		
	}
	
	public void select(){
		sqlcon sc=new sqlcon();
		Session s=sc.getSession();
		String str="from person";
		org.hibernate.Query q=s.createQuery(str);
		List<person> list=q.list();
		Iterator<person> itr=list.iterator();
		while(itr.hasNext())
		{
			
			person p=itr.next();
			passport pt=p.getPt();
			
			System.out.print(p.getPid()+"===");
			System.out.print(p.getPname()+"===");
			System.out.print(p.getPage()+"===");
			System.out.print(pt.getPpid()+"===");
			System.out.println();
		}
	}
}
