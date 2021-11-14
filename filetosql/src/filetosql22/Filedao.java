package filetosql22;

import java.io.BufferedReader;
import java.io.FileReader;
public class Filedao {
	static Student getStudent() {
		Student std = null;
		try {
			FileReader fr = new FileReader("D:\\student22.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					std = new Student();
					String aa[] = line.split(",");
					std.setId(Integer.parseInt(aa[0]));
					std.setName(aa[1]);
					std.setAge(Integer.parseInt(aa[2]));
					std.setQual(aa[3]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return std;
	}
}
