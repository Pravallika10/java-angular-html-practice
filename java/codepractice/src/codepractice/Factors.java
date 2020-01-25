package codepractice;
import java.util.Scanner;
public class Factors {
	public static void main(String agrs[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+ " ");
		}	
	}

}
