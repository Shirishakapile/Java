//cja where need to create an Array dequeue obj and add few elelmts to it and print the dequeue like queue & stack
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		ArrayDeque<Integer> a=new ArrayDeque<>();
		a.offer(20);
		a.offer(30);
		a.offer(40);
		a.offer(50);
		a.offer(60);
		//a.offer("by");
		ArrayDeque<Integer> I=a.clone();
		while(!I.isEmpty())
		{
			System.out.print(I.pollLast()+" ");
		}
		while(!a.isEmpty())
		{
			System.out.print(a.pollFirst()+" ");
		}
	}
}
