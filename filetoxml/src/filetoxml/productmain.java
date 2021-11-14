package filetoxml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class productmain {
public static void main(String[] args) {
	
	

	try
	{  
		//File f=new File("D:\\pro2.xml"); 
		//f.createNewFile();
	
		  JAXBContext context = JAXBContext.newInstance(productmain.class);
		  Marshaller marshaller = context.createMarshaller();
		  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		  File f=null;
for(int i=0;i<al.size();i++)
{
	product p=al.get(i);
int id=p.getId();
String name=p.getName();
String color=p.getColor();
int price=p.getPrice();

marshaller.marshal(p,System.out);
f=new File("D:\\pp.xml");
			 marshaller.marshal(p,f);
			
			 
			 System.out.println();
			 
			 }			 

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
