/*
    1
   22
  333
 4444
55555
*/
class Pattern42
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=i;k>=1;k--)
				System.out.print(i);
			System.out.println();
		}		
	}
}