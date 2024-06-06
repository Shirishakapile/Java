/*Create a Java Application where we need to create an object of HashMap class
add the values in the form of key-value pairs then display all keys and values.*/
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
		Set s=hm.entrySet();
		Iterator I=s.iterator();
		while(I.hasNext())
		System.out.println(I.next());
	}
}
