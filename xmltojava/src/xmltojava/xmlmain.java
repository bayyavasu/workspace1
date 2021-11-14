package xmltojava;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class xmlmain {
public static void main(String[] args) {
	try
	{
		JAXBContext context=JAXBContext.newInstance(product.class);
		Unmarshaller um=context.createUnmarshaller();
		product p=(product)um.unmarshal(new File("D:\\pp.xml"));
		System.out.println(p.getCategory());
		System.out.println(p.getColor());
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
	}catch(Exception e)
	{
		
	}
}
}
