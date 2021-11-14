package p1;

public class sixth {
public static void main(String[] args) {
	int a[]= {4,5,1,9,7};//74519

		int temp=a[0];
		a[0]=a[4];
		a[4]=a[3];
		a[3]=a[2];
		a[2]=a[1];
		a[1]=temp;
	
		
		
		
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	
	
}
}
