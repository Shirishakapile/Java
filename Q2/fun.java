package test;
public class fun
{
	static p1.I1 x=new p1.I1()
	{
		public int m1(boolean a)
		{
			System.out.println(a);
			return p1.I1.s.nextInt();
		}
	};
	static p1.Ac x2=new p1.Ac(p1.I1.s.nextInt())
	{
		public short m6(int a)
		{
			System.out.println(a);
			return p1.I1.s.nextShort();
		}
	};
	static p1.p2.I2 x3=new p1.p2.I2()
	{
		public int m8(char a)
		{
			System.out.println(a);
			return p1.I1.s.nextInt();
		}
	};
	static p1.p2.p3.I3 x4=new p1.p2.p3.I3()
	{
		public boolean m11(long a)
		{
			System.out.println(a);
			return p1.I1.s.nextBoolean();
		}
	};
	
}