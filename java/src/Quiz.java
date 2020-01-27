import java.util.Scanner;
public class Quiz 
{
   public static void main(String[] args) 
   {
	        int capital;
	        int variabletype;
	        int arithematic;
	        int count=0;
	        
	        boolean s;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("do you want to play the quiz!? type true or false");
	        s = sc.nextBoolean();
	        
	        if(s) 
	        {
	        	//scanner for input options
	            
	            System.out.println("Q1) What is the capital of India?");

	            //choose singer from these 4 options
	            System.out.println("1) Delhi\r\n" + 
	            		           "2) Mumbai\r\n" + 
	            		           "3) Chennai\r\n" + "");
	            capital = sc.nextInt();


	            if (capital == 1)
	            {	
	                System.out.println("Congrate you answer is correct");
	                capital++;
	                count++;
	            }
	            else
	            {
	            	System.out.println("Your answer is incorrect. Delhi is the right answer .");
	            }
	            
	            //Q2
	            System.out.println("Q2) Can you store the value \"dog\" in a variable of type int?");
	            System.out.println("1) yes\r\n" + 
	            		           "2) no\r\n" + "");
	            variabletype = sc.nextInt();

	            if (variabletype == 2) 
	            {
	            	System.out.println("Congrate you answer is correct ");
	                variabletype++;
	                count++;
	            }
	            else
	            {
	            	System.out.println("Your answer is incorrect. No is the right answer.");
	            }  
	            
	            //Q3
	            System.out.println("Q3) What is the result of 9+9/3?");
	            System.out.println("1) 5\r\n" + 
	            		           "2) 12\r\n" + 
	            		           "3) 15/3\r\n" + "");
	            arithematic = sc.nextInt();


	            if (arithematic == 2) 
	            {
	            	System.out.println("Congrate you answer is correct");
	                arithematic++;
	                count++;
	            }
	            else
	            {
	            	System.out.println("Your answer is incorrect. 12 is the right answer.");
	            }
	            System.out.println(count +" out of 3");
	            System.out.println("Thanks for playing");
	        }
	        else
	        	System.out.println("Bye bye");
	        }
	        
	    }
	


