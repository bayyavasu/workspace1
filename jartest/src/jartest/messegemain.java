package jartest;
import java.util.Scanner;

import message.Message;
import message.UtilClass;
public class messegemain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the mode");
	String str=sc.nextLine();
	UtilClass ul=new UtilClass();
	Message m=ul.getMessageObject(str);
           m.sendMessage();
          
	
}
}
