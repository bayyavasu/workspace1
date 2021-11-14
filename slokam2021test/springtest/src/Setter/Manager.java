package Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	private Tls  t;
	
	@Autowired
	public void setT(Tls t) {
		this.t = t;
	}

	public void doWork()
	{
		System.out.println("Manager work started");
		t.doWork();
		System.out.println("Manager work end");
	}
}
