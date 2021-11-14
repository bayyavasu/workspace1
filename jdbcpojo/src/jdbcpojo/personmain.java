package jdbcpojo;

public class personmain {
	public static void main(String[] args) {
		person p = new person();
	p.setAge(55);
	p.setCourse("jdbcpojo");
	p.setId(10);
	p.setName("anil");
		dao d=new dao();
		d.insertt(p);
	

	}
}
