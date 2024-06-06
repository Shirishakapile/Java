import java.util.*;
class A
{
	public static void main(String[]args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(7);
		al.add(12);
		al.add(16);
		al.add(17);
		al.add(20);
		al.add(21);
		/*for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%4==0)
			{
				al.remove(i);
				i--;
			}
		}
		System.out.println(al);*/
		al.removeIf((x)->x%4==0);
		for(Integer x:al)
		System.out.print(x+" ");
	}
}