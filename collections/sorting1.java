import java.util.*;
class A
{
	private int id;
	private String name;
	private float salary;
	A(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	float salary()
	{
		return salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}
class salary implements Comparator<A>
{
	public int compare(A x,A y)
	{
		if(x.salary()==y.salary())
		return 0;
		if(x.salary()<y.salary())
		return -1;
		return 1;
	}
}
class B{
	public static void main(String[]args)
	{
		ArrayList<A> al=new ArrayList<>();
		al.add(new A(10,"siri",50000));
		al.add(new A(11,"siri",60000));
		al.add(new A(14,"siri",40000));
		al.add(new A(14,"siri",70000));
		Collections.sort(al,new salary());
		for(A x:al)
		System.out.println(x);
		
	}
}