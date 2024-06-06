/*Create a Java Application where we need to create an object of the TreeMap
class add the values then display all the values in both ascending and
descending order.*/
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		TreeMap<Integer,Integer> t=new TreeMap<>();
		t.put(1,45);
		t.put(2,44);
		t.put(8,49);
		t.put(3,50);
		t.put(10,60);
		Set s=t.entrySet();
		Iterator I=s.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		Map m=t.descendingMap();
		System.out.println(m);

	}	
}
