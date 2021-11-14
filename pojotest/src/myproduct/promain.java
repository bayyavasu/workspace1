package myproduct;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class promain {
public static void main(String[] args) {
ArrayList<product>  a=new ArrayList<>();
ArrayList<colorr>  col=new ArrayList<>();
ArrayList<String>  col1=new ArrayList<>();
category c1=new category();
colorr cc1=new colorr();//xmlwrapperelement can write instead of creating new class here
col1.add("red");
col1.add("green");
col1.add("blue");
c1.setCatname("catname1");
c1.setCatcode(1);
product p1=new product();
p1.setId(1);
p1.setName("product1");
p1.setCat(c1);
cc1.setCol(col1);
p1.setColor(cc1);
a.add(p1);
                                category c2=new category();
                                ArrayList<String>  col2=new ArrayList<>();
c2.setCatname("catname2");
c2.setCatcode(2);
colorr cc2=new colorr();
col2.add("red");
col2.add("green");
col2.add("blue");
cc2.setCol(col2);
product p2=new product();
p2.setId(2);
p2.setName("product2");
p2.setColor(cc2);
p2.setCat(c2);
a.add(p2);
products pp=new products();
pp.setProducts(a);
try
{
	JAXBContext context=JAXBContext.newInstance(products.class);
	Marshaller marshaller=context.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	marshaller.marshal(pp,new File("D:\\myproduct.xml"));
	
}catch(Exception e)
{
	e.printStackTrace();
}
}
}
