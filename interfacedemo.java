import java.util.*;
interface Iemployee
{
	public void set_salary(int s);
}
class developer implements Iemployee
{
	public void set_salary(int s)
	{
		int bonus = 5000;
		System.out.println("total salary for developer:"+(s+bonus));
	}
}
class tester implements Iemployee
{
	public void set_salary(int s)
	{
		int bonus = 3000;
		System.out.println("total salary for tester:"+(s+bonus));
	}
}
class interfacedemo
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("enter salary for developer:");
		int d_salary= read.nextInt();
		System.out.print("enter salary for tester:");
		int t_salary= read.nextInt();
		developer d = new developer();
		tester t = new tester();
		d.set_salary(d_salary);
		t.set_salary(t_salary);
	}
}
	