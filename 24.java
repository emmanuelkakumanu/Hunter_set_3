
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int st=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((a[i]+a[j])==k && i!=j)
				{
					st=1;
					break;
				}
			}
		}
		if(st==1)
		System.out.print("YES");
		else
		System.out.print("NO");
	
	}
}
