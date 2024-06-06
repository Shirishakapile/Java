import java.util.*;
class A
{
	public static void main(String[]args)
	{
		int c=0;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=100;i++)
		{
			al.add(i);
		}
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
			if(it.hasNext())
			it.next();
		}
	}
}