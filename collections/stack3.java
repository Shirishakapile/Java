import java.util.*;
class A
{
	public static void main(String[]args)
	{	
		Stack<Integer> a=new Stack<>();
		String ch[]={"10","20","5","+","-","7","%","10","*"};
		int i=0;
		for(i=0;i<ch.length;i++)
		{
			try
			{
				a.push(Integer.parseInt(ch[i]));
			}	
			catch(NumberFormatException e)
			{
				if(a.size()>1)
				{
					int x=a.pop();
					int y=a.pop();
					if(ch[i].equals("+"))
					a.push(x+y);
					else if(ch[i].equals("-"))
					a.push(y-x);
					else if(ch[i].equals("*"))
					a.push(y*x);
					else if(ch[i].equals("/"))
					a.push(y/x);
					else if(ch[i].equals("%"))
					a.push(y%x);
					else
					break;
				}
				else
				break;
			}
		}
		if(i==ch.length&&a.size()==1)
		System.out.print(a);
		else
		System.out.print("invalid");
	}
}