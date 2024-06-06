import java.util.*;
class A
{
	public static void main(String[]args)
	{
	//PriorityQueue<Integer> pq=new PriorityQueue<>(); for ascending order
	PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());// for descending order
	pq.offer(20);
	pq.offer(10);
	pq.offer(5);
	pq.offer(100);
	pq.offer(60);
	System.out.println(pq.element());
	pq.poll();
	Iterator<Integer> it=pq.iterator();
	/*while(it.hasNext())
	{
		System.out.print(it.next()+" ");
	}*/
	while(!pq.isEmpty())
	{
		System.out.print(pq.poll()+" ");
	}
	}
}
