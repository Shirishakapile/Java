import java.util.*;
class A
{
	static Scanner s=new Scanner(System.in);
	static void m1(int a[])
	{
		try
		{
			String str=null;
			int b=s.nextInt();
			for(int i=0;i<b;i++)
			{
				System.out.println(a[i]+" ");
			}
			System.out.println(b/1);
			
			System.out.print(a);
			System.out.print(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[]args) throws Exception
	{
		int a[]={1,2,3,4};
		m1(a);
		
	}
}