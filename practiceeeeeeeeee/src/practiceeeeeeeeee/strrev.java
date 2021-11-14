package practiceeeeeeeeee;

public class strrev {
	
	public static void main(String[] args) {
		String str="im java program";
		String[]  strrev=str.split(" ");
		
		for(int i=strrev.length-1;i>=0;i--)
		{
			
		System.out.print(strrev[i]+" ");
		}
	}
}
