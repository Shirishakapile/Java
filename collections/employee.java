import java.util.*;
class Employee
{
		private String name;
		private String emp_id;
		private String designation;
		private double salary;
		Employee(String name,String emp_id,String designation,double salary)
		{
			this.name=name;
			this.emp_id=emp_id;
			this.designation=designation;
			this.salary=salary;
		}
		String get1()
		{
			return name;
		}
		String get2()
		{
			return emp_id;
		}
		String get3()
		{
			return designation;
		}
		double get4()
		{
			return salary;
		}
		public String toString()
		{
			return name+" "+emp_id+" "+designation+" "+salary;
		}
}
class B
{
	public static void main(String[]args)
	{
		ArrayList<Employee> al=new ArrayList<>();
		double a=0.0;
		int d=0;
		al.add(new Employee("siri","123","cs",20000));
		al.add(new Employee("indu","124","maths",20005));
		al.add(new Employee("shirisha","125","could",30000));
		al.add(new Employee("hema","126","hello",20000));
		al.add(new Employee("shivani","127","communication",20000));
		al.add(new Employee("abhi","128","pysics",20000));
		
		for(Employee x:al)
		{
			a=a+x.get4();
		}
		Double avg=(Double)a/al.size();
		System.out.println(avg);
		for(Employee x:al)
		{
			if(x.get4()>avg)
			System.out.println(x);
		}
	}
		
}