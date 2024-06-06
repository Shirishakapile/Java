import java.util.*;
class A
{
	public static void main(String[]args)
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(60);
		ll.add(50);
		ll.add(40);
		ll.add(30);	
		ll.add(20);
		ll.add(10);
		for(int i=0;i<ll.size();i++)
		{
			for(int j=i;j<ll.size();j++)
			{
				if(ll.get(i)>ll.get(j))
				{
					int t=ll.get(i);
					ll.set(i,ll.get(j));
					ll.set(j,t);
				}
			}
		}
		System.out.println(ll);
	}
}