import java.util.*;
class A
{
	public static void main(String[]agrs)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	//int a=Integer.parseInt(sc.nextLine());
		//System.out.println(al);
		for(Integer x:al}
		System.out.println(x);
		al.remove(2);
		al.add(2,15);
		al.set(3,80);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	
	}
}