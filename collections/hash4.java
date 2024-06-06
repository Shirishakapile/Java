import java.util.*;
class A
{
	public static void main(String[]args)
	{
		HashSet<Integer> hs=new HashSet<>();
		int a[]={10,5,6,10,5,8,7,8,11};
		HashSet<Integer> hs1=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(!hs.add(a[i]))
			hs1.add(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(!hs1.contains(a[i]))
			System.out.print(a[i]+" ");
		}
	}
}