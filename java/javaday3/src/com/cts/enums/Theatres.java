package com.cts.enums;

public enum Theatres 
{
     PLATINUM,
     DIAMOND,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
     GOLD,
     SILVER;
    public int ticketrate;
    private Theatres()
    {
	  this.ticketrate=200;
    }
    public int getticketrate()
    {
	   if(this==PLATINUM)
		   return this.ticketrate=600;
	   else if(this==DIAMOND)
		   return this.ticketrate=500;
	   else if(this==GOLD)
		   return this.ticketrate=400;
	   else if(this==SILVER)
		   return this.ticketrate=300;
       else
    	   return this.ticketrate;
    }  
}