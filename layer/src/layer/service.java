package layer;
import java.util.ArrayList;
public class service {
public void processData(int startMarks, int endMarks,String  qual)throws ApplicationException
{
	System.out.println("service start");
	ArrayList<student> finallist=new ArrayList<>();
	try
	{
	ArrayList<student> filestd=filedao.getStudent(startMarks, endMarks, qual);
	//System.out.println(filestd.size());
	setgrade(filestd);
	for(int i=0;i<filestd.size();i++)
	{
		student std=filestd.get(i);
		finallist.add(std);
	}
	ArrayList<student> xmlstd=xmldao.getStudent(startMarks, endMarks, qual);
	//System.out.println(xmlstd.size());
	setgrade(xmlstd);
	for(int i=0;i<xmlstd.size();i++)
	{
		student std=xmlstd.get(i);
		finallist.add(std);
	}
	System.out.println(finallist.size());
	dbdao.setstudents(finallist);
	}catch(ApplicationException e)
	{
		//e.printStackTrace();
		throw e;
	}
	System.out.println("service ended");
}
public void setgrade(ArrayList<student> list)
{
for(int i=0;i<list.size();i++)
{
	student std=list.get(i);
	if(std.getMarks()>=0 && std.getMarks()<35)
	{
	std.setGrade("fail");
	}
	else if(std.getMarks()>=35 && std.getMarks()<=50)
	{
	std.setGrade("pass");
	}
	else if(std.getMarks()>50 && std.getMarks()<=60)
	{
	std.setGrade("average");
	}
	else if(std.getMarks()>60 && std.getMarks()<=70)
	{
	std.setGrade("third class");
	}
	else if(std.getMarks()>70 && std.getMarks()<=80)
	{
	std.setGrade("second class");
	}
	else if(std.getMarks()>80 && std.getMarks()<=90)
	{
	std.setGrade("first class");
	}
	else
	{
		std.setGrade("distinction");
	}
}
}
}

