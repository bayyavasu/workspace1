package hib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class permobiledao {
public void insert()
{
	sqlcon sc=new sqlcon();
	Session s=sc.getSession();
	Transaction t=s.beginTransaction();
	person p=new person();
	p.setPname("aaryan");
	p.setPage(55);
	mobile m=new mobile();
	m.setMnumber(9989);
	m.setMsim("airtel");
	m.setPer(p);
	mobile m1=new mobile();
	m1.setMnumber(83282);
	m1.setMsim("jio");
	m1.setPer(p);
	mobile m2=new mobile();
	m2.setMnumber(707597);
	m2.setMsim("telenor");
	m2.setPer(p);
	List<mobile> list=new ArrayList();
	list.add(m);
	list.add(m1);
	list.add(m2);
	p.setMobb(list);
	
	s.save(p);
	t.commit();
	s.close();
	System.out.println("inserted");
	
}
public void getall()
{
	sqlcon sc=new sqlcon();
	Session s=sc.getSession();
	String str="from person";
  org.hibernate.Query
  q=s.createQuery(str);
  List<person> list=q.list();
  Iterator<person> itr=q.iterate();
  while(itr.hasNext())
  {
	  person p=itr.next();
	  System.out.println(p.getPname());
	  
	  
	  passport pt=p.getPt();
	  System.out.print(pt.getPpnumber());
	  System.out.print(pt.getPed());
	  System.out.print(pt.getPpid());
	  System.out.println();
	  List<mobile> l=p.getMobb();
	  Iterator<mobile> itr2=l.iterator();
	  
	  while(itr2.hasNext())
	  {
		  mobile m=itr2.next();
		  System.out.print(m.getMid() +"===" );
		  System.out.print(m.getMsim()+"===" );
		  System.out.print(m.getMnumber()+"===" );
		  System.out.println();
	  }
	  
	  
  }
}
}
