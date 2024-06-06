import java.util.*;
class A
{
	public static void main(String[]args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(20);
		
		al1.add(10);
		al1.add(20);
		al1.add(40);
		al1.add(50);
		al1.add(20);

		for(int i=0;i<al.size();i++)
		{
			Integer t=al.get(i);
			if(al1.contains(t))
			{
				System.out.println(t);
				al1.remove(t);
			}
		}

	}
}