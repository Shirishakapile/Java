import java.util.*;
class A
{
	public static void main(String[]args)
	{
		ArrayList<Integer> Al1=new ArrayList<>();
		ArrayList<Integer> Al2=new ArrayList<>();
		for(int i=1;i<20;i++)
		{
			if(i%2==0)
			Al1.add(i);
		}
		for(int i=1;i<20;i++)
		{
			if(i%3==0)
			Al2.add(i);
		}
		/*for(int i=0;i<Al1.size();i++)
		{
			Integer t=Al1.get(i);
			if(Al2.contains(t))
			{
				System.out.print(t);
			}
		}*/
		Al1.retainAll(Al2);
		for(int x:Al1)
		System.out.print(x+" ");

		
	}
}