//to follow insertion order
import java.util.*;
class A
{
	public static void main(String[]args)
	{
	Queue pq=new LinkedList();
	pq.offer(20);
	pq.offer(10);
	pq.offer(5);
	pq.offer(100);
	pq.offer(60);
	pq.offer("hi");
	System.out.println(pq.element());
	pq.poll();
	while(!pq.isEmpty())
	{
		System.out.print(pq.poll()+" ");
	}
	}
}
