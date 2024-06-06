/*Create a Java Application where we need to create an object of LinkedHashMap
class add the values in the form of key-value pairs then create a second object of
Linked HashMap add the values including the previous object of Linked
HashMap then display only keys.*/
class A
{
	public static void main(String[]args)
	{
		LinkedMap<Integer,String> hm=new LinkedMap<>();
		hm.put(10,"Siri");
		hm.put(20,"Indu");
		hm.put(30,"Akku");
		hm.put(40,"Dharu");
		hm.put(50,"hema");
		Set s=hm.entrySet();
		System.out.println(hm.containsKey(10));
		System.out.println(s);
		Set S=hm.keySet();
		Iterator I=S.iterator();
		while(I.hasNext())
		System.out.println(I.next());
	}
}