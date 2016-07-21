import java.util.Scanner;
class sumPrime
{
 public static  long Prime[];	
 public static void main(String args[])
 {
 	long prime1[] = new long[1000000];
		Scanner in = new Scanner(System.in);
		prime1 = fillPrime();
		int t = in.nextInt();

		while(t>0)
		{
			int p = in.nextInt();
			long sum = 0;
			for(int i = 0; prime1[i]<=p ; i++)
			{
				sum = sum + prime1[i];
			}
			System.out.println(sum);
			t--;

		}
 }
 public static long[] fillPrime()
	{
		long prime[] = new long[1000000];
		long prime1[] = new long[1000000];
		int j = 0;
		for(int i =1 ; i<1000000 ; i++)
		{
			prime[i] = i+1;
		}
		for(int um = 2 ; um<1000000 ; um++)
		{
			if(prime[um-1] != 0)
			{	
				for( int m = 2*um ; m<1000000 ; m= m+um)
				{
					
						prime[m-1] = 0;
				}
			}
			
		}

		

		for(int i =1 ; i<1000000 ; i++)
		{
			if(prime[i] != 0)
			{
				prime1[j] = prime[i];
				j++;
			}
		}
		return prime1;
	}
}