package sortings;

public class highinarrays {
public static void main(String[] args) {
	int a[]= {50,20,5,3,4,9};
	int high=a[0],k=0;
	
	for(int i=0;i<6;i++) {
		if(high<a[i])
		{
			high=a[i];
			k=i;
		}	
	}
	System.out.println(k);
System.out.println(high);
}
}
