import java.util.*;
class Sub
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Sub s=new Sub();
		if(n1>n2)
		s.sub(n1,n2);
		else
		s.add(n1,n2);
	}
}