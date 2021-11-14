package filetoxml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

public class productdao {

	static ArrayList<product> filetoxml() {
		ArrayList<product> allproducts = new ArrayList<>();
		product p = null;
		try {
			FileReader fr = new FileReader("D:\\produt2.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					p = new product();
					String aa[] = line.split(";");

					p.setId(aa[0]);
					p.setName(aa[1]);
					p.setColor(aa[2]);
					p.setPrice(aa[3]);
					p.setCategory(aa[4]);
					allproducts.add(p);

				}

			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allproducts;

	}

}