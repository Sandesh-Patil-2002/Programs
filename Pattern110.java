/*
12345
12344
12333
12222
11111
*/

class Pattern110
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=i;j<n;j++)
				System.out.print(i);
			System.out.println();
		}
	}
}