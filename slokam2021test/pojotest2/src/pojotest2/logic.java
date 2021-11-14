package pojotest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class logic {
	int r1;
	int r2;

	ArrayList<product> productByCategory(int r1, int r2) {
		this.r1 = r1;
		this.r2 = r2;
		ArrayList<product> al = new ArrayList<>();
		product prod = null;
		try {
			FileReader fr = new FileReader("D:\\produt2.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String arr[] = line.split(";");
					int c = Integer.parseInt(arr[3]);
					if ((c > r1) && (c < r2)) {

						prod = new product();
						prod.id = Integer.parseInt(arr[0]);
						prod.name = arr[1];
						prod.color = arr[2];
						prod.price = Integer.parseInt(arr[3]);
						prod.category = arr[4];
						al.add(prod);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
