package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class select {
public void selectt()
{
		Session s=gethibconnection.getSession();
	String hqlqu="from emp";
	Query q=s.createQuery(hqlqu);
	//q.setFirstResults(5); it starts from sixth position  
	//q.setMaxResults(5); it starts from first position and ends at fifth position
	List<emp> e=q.list();//
	Iterator<emp> i=e.iterator();
	while(i.hasNext())
	{
		emp e1=i.next();
		System.out.print(e1.getId());
		System.out.print(e1.getName());
		System.out.print(e1.getAge());
		System.out.println();
		
	}
	
}
}
