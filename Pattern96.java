/*
Ao	Fn	Jl	Mi	Oe
Bm	Gk	Kh	Nd	
Cj	Hg	Lc
Df	Ib
Ea

*/
class Pattern96
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		int count1=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			int c1=count1;
			for(int j=n,j1=i;j>=i||j1<=n;j--,j1++)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c1+96)+"\t");
				c+=j;
				c1-=j1;
			}
			System.out.println();
			count++;
			count1-=i+1;
		}	
	}
}