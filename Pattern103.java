//WAP to find greater among 4 nos

class Pattern103
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30,d=40;
		if(a>b)
			if(a>c)
				if(a>d)
					System.out.println("a is greater");
				else
					System.out.println("d is greater");
			else
				if(c>d)
					System.out.println("c is greater");
				else
					System.out.println("d is greater");
		else
			if(b>c)
				if(b>d)
					System.out.println("b is greater");
				else
					System.out.println("d is greater");
			else
				if(c>d)
					System.out.println("c is greater");
				else
					System.out.println("d is greater");
	}
}