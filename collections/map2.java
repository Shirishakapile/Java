/*Create a Java Application where we need to create a HashMap Object. Add a
few elements and then check whether a given Key element is present in the map
and then print the key-value pairs by using the entrySet method. And then print
only keys.*/
import java.util.*;
class A
{
	public static void main(String[]args)
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(10,"Siri");
		hm.put(20,"Indu");
		hm.put(30,"Akku");
		hm.put(40,"Dharu");
		hm.put(50,"hema");

		Set<Map.Entry<Integer,String>> s=hm.entrySet();
		System.out.println(hm.containsKey(10));
		System.out.println(s);
		Set S=hm.keySet();
		Iterator I=S.iterator();

		//number of ways to iteration  for entry set

		hm.forEach((x,y)->System.out.println(x+" "+y));
			
		
		/*while(I.hasNext())
		System.out.println(I.next());*/


		/*for(Map.Entry<Integer,String> x:hm.entrySet())
		System.out.println(x.getKey()+" "+x.getValue());*/


		//hm.entrySet().forEach((x)->System.out.print(x));
			
	}
}
