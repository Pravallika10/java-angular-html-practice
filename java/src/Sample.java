import java.util.Scanner; 
class Sample 
{
           public static void main(String[] args)
           {
             String name;
			 String year;
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter the name: ");
			 name= sc.next();
			 System.out.println("Enter the year: ");
			 year =sc.next();

				while(true)
				{
					int nflag=0;
					int yflag=0;
					for (int i = 0; i < name.length(); i++) 
					 {
							if (!name.matches("[0-9]+")) 
							{
								System.out.println("invalid name");
								nflag=1;
								break;
							}
						/*	else 
							{
								System.out.println("invalid name");
								nflag=1;
								break;
							} */
					 }

					if(year.matches("[0-9]+"))
					 {
						yflag = 0;
					 }
					else 
					{
						System.out.println("invalid year");
						yflag = 1;
						break;
					}
					 if(nflag==0 && yflag==0) 
					 {
						 System.out.println("My name is "+name+" and I graduated in  "+year);

						 break;
					 }
 
				}
		}

	}



