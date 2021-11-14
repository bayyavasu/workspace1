package practiceeeeeeeeee;

public class pollindrome {
public static void main(String[] args) {
	int n=121;
	int rev=0;
	for(int i=0;i>0;i++)
	{
		int a=n%10;
		rev=rev*10+a;
		rev=a;
		n=n/10;
		System.out.println(rev);
		if(rev==n)
		{
			System.out.println("given number is pollindrome");
			break;
		}
			
	
	}
	
}
}
