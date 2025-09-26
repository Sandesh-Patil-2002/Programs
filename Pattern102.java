/*
EE	DI	CL	BH	AO
ID	HH	GK	FM
LC	KG	JJ
NB	MF
OA

*/
class Pattern102
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;
		int count2=n;
		for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i,j1=n;j>=1||j1>=i1;j--,j1--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1--;	
				c2+=j1-1;
			}
			System.out.println();
			count1+=i-1;		
			count2--;
		}
	}
}