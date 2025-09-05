/*
    5
   54
  543
 5432
54321
*/
class Pattern47
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int k=n;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}		
	}
}