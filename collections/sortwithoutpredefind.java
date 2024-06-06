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
		al.add(new Employee("siri","123","cs",20000));
		al.add(new Employee("indu","124","maths",20005));
		al.add(new Employee("shirisha","125","could",30000));
		al.add(new Employee("hema","126","hello",20000));
		al.add(new Employee("shivani","127","communication",20000));
		al.add(new Employee("abhi"," 128","pysics",20000));
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).get4()<al.get(j).get4())
				{
					Employee t=al.get(i);
					al.set(i,al.get(j));
					al.set(j,t);
				}
			}
		}
		for(Employee x:al)
		{
			System.out.println(x);
		}
	}
		
}