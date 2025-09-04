/*
abcde
abcde
abcde
abcde
abcde
*/
class Pattern13
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
				System.out.print((char)(j+96));
			System.out.println();
		}
	}
}