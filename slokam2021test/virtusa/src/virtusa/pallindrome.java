package virtusa;

public class pallindrome {
public static void main(String[] args) {
	int number=681,sum=0,a;
	int temp=number;
	while(number>0)
	{
		a=number%10;
		sum=(sum*10)+a;	
		number=number/10;
	}
	System.out.println(sum);
	
}
}