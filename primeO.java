import java.util.Scanner;
import java.lang.Math;
class primeO
{
	 public static  long prime[];
	 public static void main(String[] args) {
	 	long prime1[] = new long[100000];
		Scanner in = new Scanner(System.in);
		prime1 = fillPrime();
		int t = in.nextInt();

		while(t>0)
		{
			int p = in.nextInt();
			int count = 0;
			System.out.println(prime1[p-1]);
			t--;
		}


		
	}

	public static long[] fillPrime()
	{
		long prime[] = new long[200000];
		long prime1[] = new long[200000];
		int j = 0;
		for(int i =1 ; i<200000 ; i++)
		{
			prime[i] = i+1;
		}
		/*for(int k =1 ; k<100000 ; k++)
		{
			prime[k] = 0;
		}*/
		for(int um = 2 ; um<200000 ; um++)
		{
			if(prime[um-1] != 0)
			{	
				for( int m = 2*um ; m<200000 ; m= m+um)
				{
					
						prime[m-1] = 0;
						//System.out.println(prime[m-1]);
				}
			}
			
		}

		

		for(int i =1 ; i<200000 ; i++)
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