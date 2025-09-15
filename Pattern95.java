/*
Ao
Bn	Cm	
Dl	Ek	Fj
Gi	Hh	Ig	Jf
Ke	Ld	Mc	Nb	Oa

*/
class Pattern95
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		int count1=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(64+count++));
				System.out.print((char)(96+count1--) + "\t");
			}
			System.out.println();
			
		}		
	}
}