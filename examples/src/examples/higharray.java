package examples;

public class higharray {
public static void main(String[] args) {
	int a[]= {5,10,20,30,8};
	int high=a[0],k=0;
	int i=1;
	while(i<5)
	{
		if(high<a[i])
		{
		high=a[i];
	}i++;
	}
	System.out.println(high);
}
}