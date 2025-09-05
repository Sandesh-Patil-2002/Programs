/*
12345
 1234
  123
   12
    1
*/
class Pattern44
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			System.out.println();
		}		
	}
}