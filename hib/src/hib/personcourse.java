package hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class personcourse {
public void insert()
{
	sqlcon sc=new sqlcon();
	Session s=sc.getSession();
	Transaction t=s.beginTransaction();
	person p=new person();
}
}
