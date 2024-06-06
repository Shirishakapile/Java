import java.util.*;
class A
{
	public static void main(String[]args)
	{
		int key=3;
		ArrayList<String> al=new ArrayList<>();
		al.add("client1");
		al.add("client2");
		al.add("client3");
		al.add("client4");
		al.add("client1");
		ArrayList<String> al2=new ArrayList<>();
		for(int i=al.size()-1;key>0;i--)
		{
			if(!al2.contains(al.get(i)))
			{
				al2.add(al.get(i));
				key--;
			}
		}
		for(String x:al2)
		System.out.println(x);
	}
}