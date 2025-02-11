package p1;
public interface I2
{
	static int m3(boolean a)
	{
		System.out.println(a);
		return I1.s.nextInt();	
	}
	float m4(boolean a);
}