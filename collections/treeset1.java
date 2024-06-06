/*Create a Java Application where we need to create an object for TreeSet, add
only integer type of values then display all these values in both ascending and
descending order*/

import java.util.*;
class A
{
	public static void main(String[]args)
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(5);
		ts.add(20);
		ts.add(1);
		Iterator<Integer> I=ts.iterator();
		while(I.hasNext())
		{
			System.out.print(I.next()+" ");
		}
		Iterator<Integer> I1=ts.descendingIterator();
		System.out.println();
		while(I1.hasNext())
		{
			System.out.print(I1.next()+" ");
		}
	}
}
