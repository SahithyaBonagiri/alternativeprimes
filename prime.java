public class prime
{
	public static void main(String[] args)
	{
		int n=20;
		System.out.println("Alternative primes numbers upto 20 are ");
		for(int i=2;i<=n;i++)
		{
			int t=0;
			boolean p=true;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					t++;
			}
			if(t==2)
			{
				if(p==true)
				{
					System.out.println(i+" ");
					p=false;
				}
				else
					p=true;
			}
		}
	}
}
