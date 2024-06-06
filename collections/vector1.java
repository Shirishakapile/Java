import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Vector<Integer> v=new Vector<>(3);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v.size()+" "+v.capacity());
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println(v.size()+" "+v.capacity());
		System.out.println(v.removeAll(v));
		System.out.println(v.size()+" "+v.capacity());
		
	}
}





