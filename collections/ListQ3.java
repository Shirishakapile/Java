import java.util.*;
class A
{
	public static void main(String[]args)
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);	
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
	}
}