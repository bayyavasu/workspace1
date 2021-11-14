
public class shifting {
public static void main(String[] args) {
	int a[]=new int[6];
	a[0]=22;
	a[1]=23;
	a[2]=25;
	a[3]=80;
	a[4]=70;
	a[5]=60;
	int i,temp=a[5];
	for(i=5;i>0;i--)
	{
		a[i]=a[i-1];
	}
	a[0]=temp;
	for(i=0;i<6;i++)
	{
		System.out.println(a[i]);
	}
}
}
