package p3;
import p1.*;
public class A extends p1.p2.Ac implements I1,I2,p1.p2.I3
{
	public boolean m2(int a)
	{
		System.out.println(a);
		return I1.s.nextBoolean();
	}
	public float m4(boolean a)
	{
		System.out.println(a);
		return I1.s.nextFloat();	
	}
	public boolean m5(int a)
	{	
		System.out.println(a);
		return I1.s.nextBoolean();
	}
	public float m6(long a)
	{
		System.out.println(a);
		return I1.s.nextFloat();
	}
	public long m7(String a)
	{
		System.out.println(a);
		return I1.s.nextLong();
	}
	public A()
	{
		super(I1.s.nextBoolean());
	}
	public static void main(String[]args)
	{
		I1 x=new A();
		System.out.println(I1.m1(I1.s.nextFloat()));
		System.out.println(x.m2(I1.s.nextInt()));
		
		I2 x2=(A)x;
		System.out.println(I2.m3(I1.s.nextBoolean()));
		System.out.println(x2.m4(I1.s.nextBoolean()));
		
		p1.p2.I3 x3=(A)x2;
		System.out.println(x3.m5(I1.s.nextInt()));
		System.out.println(x3.m6(I1.s.nextLong()));
		
		p1.p2.Ac x4=(A)x3;
		System.out.println(x4.m7(I1.s.next()));
		System.out.println(x4.m8(I1.s.nextInt()));
	}
	
}


