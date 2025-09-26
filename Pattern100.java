/*
				EO
			IJ	DN
		LF	HI	CM
	NC	KE	GH	BL
OA	MB	JD	FG	AK

				5
			9	4
		12	8	3
	14	11	7	2
15	13	10	6	1

				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11
*/
class Pattern100
{
	public static void main(String args[])
	{
		int n=5;
		int count=n;
		int count1=(n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			int c1=count1;
			for(int j=i;j>1;j--)
				System.out.print(" "+"\t");
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c1+64));
				System.out.print("\t");
				c-=j+1;
				c1+=j;
			}
			System.out.println();
			count+=i-1;
			count1-=i;
		}
	}
}