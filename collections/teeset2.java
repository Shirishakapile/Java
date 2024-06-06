import java.util.*;
class A
{
	public static void main(String[]aqrgs)
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(35);
		t.add(30);
		t.add(120);
		t.add(20);
		t.add(60);
		t.add(50);
		t.add(40);
		System.out.println("less than a given value and greater than agiven value.");
		//System.out.println(t.headSet(10)+" "+t.tailSet(60));
		Set<Integer> ts=t.headSet(10);
		System.out.println(ts);
		System.out.println("values that are in between the range of two specific values");
		System.out.println(t.subSet(20,false,100,false));
		System.out.println("print firt and last");
		System.out.println(t.first()+" "+t.last());
		Set<Integer> s=t.descendingSet();
		s.add(2);
		s.add(42);
		Iterator<Integer> I=s.iterator();
		while(I.hasNext())
		{
			System.out.print(I.next()+" ");
		}
		System.out.print(t.pollFirst()+" removing first");
		System.out.print(t.pollLast()+" removing last");
		System.out.println("next greater Than value+"+t.higher(20));
		System.out.println("next Lower Than value+"+t.lower(20));
	}
}