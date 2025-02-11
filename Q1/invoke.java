package test3;
public class invoke
{
	public static void main(String[]args)
	{
		p11.pa1 x=new p11.pa1(p11.pa1.s.next().charAt(0));
		System.out.println(x.m1(p11.pa1.s.nextBoolean()));
		System.out.println(p11.pa1.m2(p11.pa1.s.next()));
		p11.abc x1=new st();
		System.out.println(x1.m3(p11.pa1.s.nextFloat()));
		p11.iiii x2=(st)x1;
		System.out.println(p11.iiii.m4(p11.pa1.s.nextInt()));
		System.out.println(x2.m5(p11.pa1.s.next()));
		p11.p12.pa2 x3=new p11.p12.pa2(p11.pa1.s.next());
		System.out.println(x3.m6(p11.pa1.s.nextBoolean()));
		System.out.println(st.obj.m7(p11.pa1.s.nextBoolean()));
		System.out.println(st.obj.m8(p11.pa1.s.nextDouble()));
		p11.p12.pif x4=(st)x1;
		System.out.println(x4.m9(p11.pa1.s.nextInt()));
		p11.p12.p13.pif2 x5=(st)x4;
		System.out.println(x5.m10(p11.pa1.s.nextInt()));
		
	}
}

