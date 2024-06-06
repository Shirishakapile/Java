import java.util.*;
class A
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int d=a*b;
		int ar[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			ar[i][j]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==j&&ar[i][j]!=1)
				{
				c=1;
				break;
				}
				else if(i!=j&&ar[i][j]!=0)
				{
				c=1;
				break;
				}
			}
		}
		if(c==0)
		System.out.print("identity");
		else
		System.out.print("not identity");
	}
}	