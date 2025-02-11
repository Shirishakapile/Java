package test;
public class Main
{
	public static void main(String[]args)
	{
	System.out.println(fun.x.m1(p1.I1.s.nextBoolean()));
	System.out.println(p1.I1.A.m2(p1.I1.s.nextFloat()));
	
	p1.A1 obj2=new p1.A1(p1.I1.s.nextBoolean());
	System.out.println(obj2.m3(p1.I1.s.nextInt()));
	
	p1.A1.AA obj3=new p1.A1.AA();
	System.out.println(obj3.m4(p1.I1.s.next()));
	System.out.println(fun.x2.m5(p1.I1.s.nextBoolean()));
	System.out.println(fun.x2.m6(p1.I1.s.nextInt()));
	
	//p1.p2.I2 obj4=new fun();
	System.out.println(fun.x3.m7(p1.I1.s.nextFloat()));
	System.out.println(fun.x3.m8(p1.I1.s.next().charAt(0)));
	
	p1.p2.B x=new p1.p2.B(p1.I1.s.next());
	System.out.println(x.m9(p1.I1.s.nextDouble()));
	System.out.println(x.m10(p1.I1.s.next().charAt(0)));

	System.out.println(fun.x4.m11(p1.I1.s.nextLong()));
	System.out.println(p1.p2.p3.I3.AI.m12(p1.I1.s.next()));
	}
}