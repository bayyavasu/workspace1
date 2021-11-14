import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;
public class absolpath {
public static void main(String args[]) {
	File file=new File("D:\\");
	File[] f=file.listFiles();
	Stream<File> fs=Arrays.asList(f).stream();
	//fs.fs.filter((i)-> {
	//return i.getName().startsWith("v");}).
	fs.filter(i-> i.getName().startsWith("v")).filter(i->i.isFile()).filter(i->i.length()>55)
	.forEach((i)->{
		System.out.println(i.getName()+"::"+i.getAbsolutePath());
	});
}
}
