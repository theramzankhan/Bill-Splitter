//BILL SPLITTER PROJECT

import java.io.*;
class BillSplitter
{
	public static void main(String args[])
	{
		char rup='\u0024';
		System.out.println("\nWaiter, What's The Bill Amount ???");
		int bill_amt=Integer.parseInt(args[0]);
		System.out.println("Sir, Your Bill Amount Is: " + rup + args[0]);
		System.out.println("Could you please divide the Bill ???");
		System.out.println("How many persons do you have with U ???");
		int no_of_person=Integer.parseInt(args[1]);
		System.out.println("I have : "+ args[1] + " persons");
		System.out.println("Ok Sir!,please a second...");
		int amount=bill_amt / no_of_person;
		System.out.println("Each person have to give : " + '\u0024' + amount);
		System.out.println("Thank You, Have a Nice Day!");

		try
		{
			File f = new File("Bill.txt");
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(new java.util.Date() + "  --->  AMOUNT = " + amount);
			pw.close();
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}