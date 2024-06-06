import java.util.*;
class A
{
	public static void main(String[]args)
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(40000);
		ts.add(50000);
		ts.add(30000);
		ts.add(20000);
		ts.add(60000);
		System.out.println("first lowest "+ts.first());
		System.out.println("first Higest "+ts.last());
		System.out.println("Range values "+ts.subSet(20000,false,60000,true));
		System.out.println("lessthan values "+ts.headSet(50000));
		System.out.println("Greaterthan values "+ts.tailSet(50000));
	}
}                                