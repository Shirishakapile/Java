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
		ll.remove(ll.size()/2);
		if(ll.size()%2==1)
		System.out.println(ll.remove(ll.size()/2));
		for(Integer x:ll)
		System.out.print(x);
	}
}

	