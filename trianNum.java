import java.util.Scanner;
class TriangularNum
{
	public static long prime[] = new long[200000];
	public static long prime1[] = new long[200000];
	public static long numbers(int n)
	{
		int count =0;
		int tcount =0;
		int k =1;
		long tsum =0;
		int flag = 0;
		int i = 0;
		long sum = 0;
			while(count<n)
			{
				sum = (k*(k+1))/2;
				tsum = sum;
				i = 0;
				count = 0;
				while(tsum>1)
				{
					if(i<=200000 && prime1[i]!=0){
					while(tsum%prime1[i]==0)
					{
						tcount++;
						tsum = tsum/prime1[i];
						//System.out.println(tsum);
						flag = 1;
					}
					if(flag == 1)
					{
						tcount++;
						flag=0;
					}
					
					if(tcount>0)
					{
						
						if(count == 0)
						{
							count = tcount;
						}
						else
						{
						count = count*tcount;
						}
					tcount =0;
				}

					i++;
				}
				
			}
			count = count-1;
			k++;
		}
			return sum;
	}


	public static void fillPrime()
	{
		
		int j = 0;
		//long prime[] = new long[200000];
		//long prime1[] = new long[200000];
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
				//System.out.println(prime1[0]);
				j++;
			}
		}
		//return prime1;
	}


	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);	
		//long a[] = new long[10001];
		fillPrime();
		//System.out.println("done");
		/*for(int i =1;i<1002;i++)
		{
			a[i] = numbers(i);
			System.out.println(a[i]);
		}*/
				int t = in.nextInt();
		while(t>0)
		{
			int n = in.nextInt();
			//public static int a[] = new int [n] ;
			//int tn = numbers(n);
			System.out.println(numbers(n));
			t--;
		}

	}
}