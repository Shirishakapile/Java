import java.util.*;
class A
{
	static void m1(ArrayList<Integer> al)
	{
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int t=al.get(i);
					al.set(i,al.get(j));
					al.set(j,t);
				}
			}
		}
		
			System.out.print(al);
	}
	public static void main(String[]args)
	{
		ArrayList<Integer> Al1=new ArrayList<>();
		Al1.add(40);
		Al1.add(50);
		Al1.add(30);
		Al1.add(20);
		Al1.add(10);
		m1(Al1);
		
		/*Collections.sort(Al1);
		System.out.println(Al1);*/

		
	
	}
}