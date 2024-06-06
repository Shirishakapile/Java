/*Create a Java Application where we need to create an object of LinkedHashMap
class add the values in the form of key-value pairs then create a second object of
Linked HashMap add the values including the previous object of Linked
HashMap then display only keys*/
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>(); 
		int a[]={10,10,2,5,6,7,5,2,2};
		/*for(int i=0;i<a.length;i++)
		{
			lh.put(a[i],lh.getOrDefault(a[i],0)+1);
		}
		Set s=lh.entrySet();
		Iterator I=s.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}*/
		
		for(int i=0;i<a.length;i++)
		{
			if(lh.containsKey(a[i]))
			{
				Integer t=lh.get(a[i]);
				lh.put(a[i],t+1);
			}
			else
			{
				lh.put(a[i],1);
			}
		}
		Set s=lh.entrySet();
		Iterator I=s.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
	}
}