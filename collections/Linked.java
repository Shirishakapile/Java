import java.util.*;
class A
{
	static ArrayList<Integer> maxList(LinkedList<LinkedList<Integer>> ll)
	{
		ArrayList<Integer> l4=new ArrayList<>();
		int c=0;
		for(int i=0;i<ll.size();i++)
		{
			int max=ll.get(i).get(0);
			for(int j=0;j<ll.get(i).size();j++)
			{
			    if(ll.get(i).get(j)>max)
			     max=ll.get(i).get(j);
			}
			l4.add(max);
		}
		return l4;
	}
	public static void main(String[]args)
	{
		LinkedList<LinkedList<Integer>> ll1=new LinkedList<>();
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(10);
		l1.add(5);
		l1.add(25);
		ll1.add(l1);
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(25);
		l2.add(40);
		l2.add(5);
		ll1.add(l2);
		LinkedList<Integer> l3=new LinkedList<>();
		l3.add(44);
		l3.add(60);
		l3.add(90);
		ll1.add(l3);
		ArrayList<Integer> al=maxList(ll1);
		for(Integer x:al)
		System.out.print(x+" ");
		
	}
}