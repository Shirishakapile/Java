package p1;
public class A1 
{
	public A1(boolean a)
	{
		System.out.println(a);
	}
	public long m3(int a)
	{
		System.out.println(a);
		return I1.s.nextLong();	
	}
	public static class AA
	{
		public static char m4(String a)
		{
			System.out.println(a);
			return I1.s.next().charAt(0);
		}
	}
}