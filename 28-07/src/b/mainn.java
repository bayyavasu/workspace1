package b;
import java.util.Scanner;

import a.messenger;
public class mainn {
public static void main(String[] args) {
userinterface ui=new userinterface();
Scanner sc=new Scanner(System.in);
System.out.println("enter messege to send");
String messege = sc.nextLine();
String option = sc.nextLine();
 messenger mes =ui.getmessage(option);////new mail;
mes.sendmessege(messege);




}

}
