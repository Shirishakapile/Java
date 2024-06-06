import java.util.*;
class A
{
	public staic void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];

		int n1=s.nextInt();
		int m1=s.nextInt();
		int b[][]=new int[n][m];
		
		int c[][]=new int[n][m1];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m1;j++)
			{
				for(int k=0;k<n1;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}