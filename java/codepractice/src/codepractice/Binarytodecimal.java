package codepractice;
import java.util.Scanner;
public class Binarytodecimal {
	 public static int conversionfun(long n)
	    {
	        int decinum = 0, i = 0;
	        long rem;
	        while (n != 0)
	        {
	            rem = n % 10;
	            n /= 10;
	            decinum += rem * Math.pow(2, i);
	            ++i;
	        }
	        return decinum;
	    }
	public static void main(String[] args) {
        long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        n=sc.nextInt();
        int decimal = conversionfun(n);
        System.out.printf("%d in binary = %d in decimal", n, decimal);
    }

}
