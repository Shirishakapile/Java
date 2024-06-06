import java.util.*;
class A
{
	public static void main(String[]args)
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(60);
		ll.add(50);
		ll.remove(1);
		ll.add(2,80);
		ll.set(3,100);
		System.out.println(ll);
		ListIterator<Integer> lt=ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("\n");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
	}
}