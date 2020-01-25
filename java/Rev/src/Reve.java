import java.util.Scanner;

public class Reve {

	public static void main(String args[])
    {
        int n,rev=0;
   	 System.out.println("Enter the number");
   	 Scanner sc=new Scanner(System.in);
   	 n=sc.nextInt();
   	 while(n!=0)
   	 {
   		 rev=rev*10;
   		 rev=rev+n%10;
   		 n=n/10;
   	 }
    
      System.out.println("the reversed number is " + rev);
    }
}
                                                                      