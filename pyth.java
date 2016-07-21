import java.util.Scanner;
class Pytha
{
	public static long ar[] = new long[3000];
	public static void main(String arg[])
	{
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		pyth();
		while(t>0){
			int sum = in.nextInt();
			System.out.println(ar[sum-1]);
			t--;
		}
	}

	public static void pyth()
	{
		int sum =1;
		while(sum<=3000){
			long prod = 0;
			for(int i =1 ; i<sum/3 ; i++)
			{
				for(int j = i ; j<sum/2 ; j++)
				{
					int c = sum-i-j;
					if( ((i*i)+(j*j)) == (c*c) )
					{
						int temp = i*j*c;
						if(temp>prod)
						{
							prod = temp;
						}
					}
				}
			}
			if(prod != 0)
			{
				ar[sum-1] = prod;
			}
			else
			{
				ar[sum-1] = -1;			}

			sum++;
		}

	}
}