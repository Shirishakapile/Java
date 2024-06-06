import java.util.*;
class A extends Thread
{
	public void run()
	{
		System.out.println("t1");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
class B extends Thread
{
	public void run()
	{
		System.out.println("t2");
		for(int i=20;i<=40;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
class C extends Thread
{
	public void run()
	{
		System.out.println("t3");
		for(int i=60;i<=70;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
class D extends Thread
{
	public void run()
	{
		System.out.println("t4");
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
class E
{
	public static void main(String[]args) throws Exception
	{
		A t1=new A();
		B t2=new B();
		C t3=new C();
		D t4=new D();
		t3.start();
		try
		{
			t3.join();
		}
		catch(Exception e)
		{
		}
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
		}
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
		}
		t4.start();
		try
		{
			t4.join();
		}
		catch(Exception e)
		{
		}
		
		
	}
}