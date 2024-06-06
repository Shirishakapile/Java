import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int k=n.indexOf("{");
		int k1=n.indexOf("}");
		String ss=n.substring(k+1,k1);
		String sa[]=ss.split(",");
		int a[]=new int[sa.length];
		int c=0;
		for(int i=0;i<sa.length;i++)
		{
		    a[c]=Integer.parseInt(sa[i]);
		    c++;
		}
		for(int i=0;i<sa.length;i++)
		{
		    int fc=0;
		    for(int j=1;j<=a[i];j++)
		    {
		        if(a[i]%j==0)
		        fc++;
		    }
		    if(fc==2)
		    System.out.print(a[i]);
		}
	}
}
