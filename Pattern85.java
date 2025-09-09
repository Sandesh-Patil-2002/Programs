/*
				1
			3	2
		6	5	4
	10	9	8	7
15	14	13	12	11
*/
class Pattern85
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print("\t");
			int c=count;
			for(int j=i;j>=1;j--)
				System.out.print(c-- +"\t");
			System.out.println();
			count+=i+1;

		}
	}
}