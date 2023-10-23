import java.util.*;
class student
{
	int stu_id;
	String stu_name;
	public student(int i,String n)
	{
		stu_id=i;
		stu_name=n;
	}
	public void details()
	{
		System.out.println("ID: "+stu_id);
		System.out.println("NAME: "+stu_name);
	}
}	
class parameterizedconstructor
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("enter student id:");
		int id=read.nextInt();
		read.nextLine();
		System.out.print("enter student name:");
		String name=read.nextLine();
		student s1=new student(id,name);
		s1.details();
	}
}