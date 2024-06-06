import java.util.*;
interface I1
{
	static Scanner s=new Scanner(System.in);
	int m1(String a);
	static boolean m2(float a)
	{
		System.out.println(a);
		return s.nextBoolean();
	}
}
interface I2
{
	int m3(String a);
	static boolean m4(float a)
	{
		System.out.println(a);
		return I1.s.nextBoolean();
	}
}
abstract class A
{
	A(int a)
	{
		System.out.print(a);
	}
	char m5(long a)
	{
		System.out.println(a);
		return I1.s.next().charAt(0);
	}
	abstract String m6(long a);
}
class B extends A implements I1,I2
{
static Scanner s=new Scanner(System.in);
	public int m1(String a)
	{
		System.out.println(a);
		return s.nextInt();
	}
	public int m3(String a)
	{
		System.out.println(a);
		return s.nextInt();
	}
	String m6(long a)
	{
		System.out.println(a);
		return s.next();
	}
	B()
	{
		super(s.nextInt());
	}
	public static void main(String[]args)
	{
		B x=new B();
		System.out.println(x.m1(s.next()));
		System.out.println(I1.m2(s.nextFloat()));
		System.out.println(x.m3(s.next()));
		System.out.println(I2.m4(s.nextFloat()));
		System.out.println(x.m5(s.nextLong()));
		System.out.println(x.m5(s.nextLong()));
	}
}