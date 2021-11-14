import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
public class mainnnn {
public static void main1(String[] args) {
	serializablestude s=new serializablestude();
	s.setId(10);
	s.setName("j");
	s.setQual("ss");
	s.setMarks(4);
	try(FileOutputStream fos=new FileOutputStream("D:\\jp\\serializable.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			){
		oos.writeObject(s);
		System.out.println("success");
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
}
	public static void main(String[] args) {
				try( FileInputStream fis=new FileInputStream("D:\\jp\\serializable.ser");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			serializablestude  s=(serializablestude)ois.readObject();
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getQual());
			System.out.println(s.getMarks());
			System.out.println("read successfully");
		}catch(Exception e)
		{
		e.printStackTrace();	
		}	
	}
}
