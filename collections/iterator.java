import java.util.*;
class A
{
	public static void main(String[]args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		Object a[]=al.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}	
		System.out.println();
		for(Integer x:al)
		{
			System.out.println(x);
		}
		al.forEach(x->System.out.print(x));
		System.out.println();
		while(!al.isEmpty())
		{
			System.out.print(al.remove(0));
		}
			
	}
}