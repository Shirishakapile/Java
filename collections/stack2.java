import java.util.*;
class A
{
	public static void main(String[]args)
	{	
		Stack<Character> a=new Stack<>();
		String s="{()[][" ;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
			{
				a.push(ch);
			}
			else
			{
				if(a.isEmpty())
				break;
				else if(ch=='}'&&a.peek()=='{')
				{
					a.pop();
				}
				else if(ch==']'&&a.peek()=='[')
				{
					a.pop();
				}
				else if(ch==')'&&a.peek()=='(')
				{
					a.pop();
				}
			}
		}
		if(a.isEmpty()&&a.length())
		System.out.print("valid");
		else
		System.out.println("not valid");
	}
}
			













