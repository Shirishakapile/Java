import java.util.*;
class A
{
/*methods for listItearator
	hasNext();
	next();
	hasPrevious()
	previous()
	*/	
	public static void main(String[]args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			String x=s.nextLine();
			if(x.isEmpty())
			break;
			al.add(Integer.parseInt(x));
		}
		
		/*al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		ListIterator it1=al.listIterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next());
		}
		while(it1.hasPrevious())
		{
			System.out.print(it1.previous());
		}

		//only back ward
		ListIterator it=al.listIterator();
		while(it.hasPrevious())
		{
			System.out.print(it.previous());
		}*/
		
	}
}