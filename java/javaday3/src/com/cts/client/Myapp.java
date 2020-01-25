package com.cts.client;
import com.cts.enums.*;

public class Myapp 
{
	public static void main(String args[])
	{
	  Theatres th=Theatres.PLATINUM;
	  System.out.println(th);
	  System.out.println("Ticket rate for platinum "+Theatres.PLATINUM.getticketrate());
	  System.out.println("Ticket rate for diamond " +Theatres.DIAMOND.getticketrate());
	  System.out.println("Ticket rate for gold "    +Theatres.GOLD.getticketrate());
	  System.out.println("Ticket rate for silver "  +Theatres.SILVER.getticketrate());
	}

}
