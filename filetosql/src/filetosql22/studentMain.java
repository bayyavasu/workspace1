package filetosql22;

public class studentMain {
public static void main(String[] args) {
	Student std=Filedao.getStudent();
	DBDao.saveStudent(std);
}
}
