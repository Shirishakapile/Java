import java.util.*;
class A
{
	private String S_name;
	private String S_id;
	private int marks;
	/*void set1(String S_name)
	{
		this.S_name=S_name;
	}
	void set2(String S_id)
	{
		this.S_name=S_id;
	}
	void set3(int marks)
	{
		this.marks=marks;
	}*/
	String get1()
	{
		return S_name;
	}
	String get2()
	{
		return S_id;
	}
	int get3()
	{
		return marks;
	}
	 A(String S_name,String S_id,int marks)
	{
		this.S_name=S_name;
		this.S_id=S_id;
		this.marks=marks;
	}
}
class B
{
	public static void main(String[]args)
	{
		ArrayList<A> lt=new ArrayList<>();
	
		lt.add(new A("siri","123",80));
		lt.add(new A("indu","124",79));
		lt.add(new A("hema","123",85));
		for(A x:lt)
		System.out.println(x.get1()+" "+x.get2()+" "+x.get3());
	}
}