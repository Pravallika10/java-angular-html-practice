package patt;
import java.util.Scanner;
public class Pat {
  public static void main(String args[])
  {
	  int i,j,k,n;
	  System.out.println("Enter the n value");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  for(i=1;i<=n;i++)
	  {
		  for(j=n-1;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(k=i-1;k>=-(i-1);k--)
		  {
			  System.out.print(i-Math.abs(k));
		  }
		  System.out.println();
	  }
		  
	  
  }
}
