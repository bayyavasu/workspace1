package b;
import a.mail;
import a.messenger;
import java.util.Scanner;

public class userinterface {

     public messenger getmessage(String option)
	
	{
		messenger mes=null;
	
	if(option.equals("mail"))
	{
		mes=new mail();
	}
	return mes;
	}
}

