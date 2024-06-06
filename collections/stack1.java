import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.peek()); 
		System.out.println(s.search(30));
		System.out.println(s.pop());	
		Enumeration<Integer> e=s.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		} 
		while(!s.isEmpty())	
		{
			System.out.print(s.pop()+" ");
		
		}
		/*Iterator<Integer> I=s.iterator();
		while(I.hasNext())
		{
			System.out.print(I.next()+" ");
		}*/
	}
}