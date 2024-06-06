import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=1;i<=8;i++)
		{
			a.add(Integer.parseInt(s.nextLine()));	
		}
		int p1=0,p2=0,c=0;
		while(!a.isEmpty())
		{
			Integer t=a.remove(0);
			if(c%2==0)
			{
				p1=p1+t;
			}
			else
			p2=p2+t;
			c++;
			if(t%2==0)
			Collections.reverse(a);
			
		}
		System.out.println(p1+" - "+p2+" = "+(p1-p2));
	}
}