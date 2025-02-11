package p1.p2;
public interface I2
{
	default String m7(float a)
	{
		System.out.println(a);
		return p1.I1.s.next();
	}
	int m8(char a);
}