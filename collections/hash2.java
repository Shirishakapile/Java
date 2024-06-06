import java.util.*;
class A
{
	public static void main(String[]args)
	{
	HashSet<Integer> hs=new HashSet<>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(6);
	hs.add(7);
	hs.add(8);
	hs.add(9);
	Iterator<Integer> I=hs.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	}
}