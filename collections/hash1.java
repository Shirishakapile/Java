import java.util.*;
class A
{
	public static void main(String[]args)
	{
	HashSet<Integer> hs=new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	Iterator<Integer> I=hs.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	}
}