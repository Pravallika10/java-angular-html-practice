package codepractice;
import java.util.Scanner;
public class Countdigits {
	public static void main(String args[]) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("the number of digits are "+count);
	}

}
