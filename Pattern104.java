/*
EdCbA
EdCbA
EdCbA
EdCbA
EdCbA
*/

class Pattern104
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				char result=(j%2!=0)?(char)(j+64):(char)(j+96);
				System.out.print(result);		
			}
			System.out.println();
		}
	}
}