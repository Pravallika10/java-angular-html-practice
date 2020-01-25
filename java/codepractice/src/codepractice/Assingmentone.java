package codepractice;
import java.util.Scanner;
public class Assingmentone {
	public static void main(String agrs[]) {
		String name;
		String age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your age:");
		age=sc.nextLine();

		while(!name.matches("^[a-zA-Z]*$")&& !age.matches("^[0-9]*$"))
		{
			
		}
		System.out.println("invalid name");   
		
		System.out.printf("Hello your name is " +name+ " and age is " +age );
	}

}
