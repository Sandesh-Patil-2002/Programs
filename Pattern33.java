/*
eeeee
dddd
ccc
bb
a
*/
class Pattern33
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print((char)(i+96));
			System.out.println();
		}
	}
}