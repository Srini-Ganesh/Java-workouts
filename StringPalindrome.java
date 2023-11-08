import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class StringPalindrome
{
	public static boolean checkPalindrome(String s)
	{
		Stack<Character> stk=new Stack<>();
		for(Character ch:s.toCharArray())
		{
			stk.push(ch);
		}
		for(Character ch:s.toCharArray())
		{
			if(stk.pop()!=ch)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=read.nextLine();
		System.out.println(checkPalindrome(str));
		System.out.println((char)65);
	}
}