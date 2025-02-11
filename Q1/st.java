package test3;
public class  st extends p11.abc implements p11.iiii,p11.p12.pif,p11.p12.p13.pif2
{
	public String m3(float a)
	{
		System.out.println(a);
		return p11.pa1.s.next();
	}	
	public double m5(String a)
	{
		System.out.println(a);
		return p11.pa1.s.nextDouble();
	}
	public boolean m9(int a)
	{
		System.out.println(a);
		return p11.pa1.s.nextBoolean();
	}	
	public float m10(int a)
	{
		System.out.println(a);
		return p11.pa1.s.nextFloat();
	}	
	public st()
	{
		super(p11.pa1.s.nextLong());
	}
	static p11.p12.abc2 obj=new p11.p12.abc2()
		{
			public char m8(double a)
			{
				System.out.println(a);
				return p11.pa1.s.next().charAt(0);
			}	
		};
	
}   