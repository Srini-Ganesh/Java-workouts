import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class LeapYearOrNot
{
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter year to check: ");
		int year=read.nextInt();
		
		if(year%400==0)
		{
			System.out.println(year+" is a leap year..");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println(year+" is a leap year..");
		}
		else
		{
			System.out.println(year+" is not a leap year..");
		}
	}
}
