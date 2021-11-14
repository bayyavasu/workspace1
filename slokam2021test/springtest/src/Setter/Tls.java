package Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tls {
	
private Developers devs;



@Autowired
public void setDevs(Developers devs) {
	this.devs = devs;
}


public void doWork()
{
	System.out.println("Tl work started");
	devs.doWork();
	System.out.println("Tl work end");
}
}