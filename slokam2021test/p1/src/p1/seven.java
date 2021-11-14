package p1;

public class seven {
public static void main(String[] args) {
	int a[]= {4,5,1,9,7};//74519
	/*75194
	74195
	74591
	74519
*/
	for(int i=0;i<a.length-1;i++)
	{
	int temp=a[i];
	a[i]=a[a.length-1];
	a[a.length-1]=temp;
	}
	

	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	
	}
	
}

}
