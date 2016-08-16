import java.util.Scanner;
class LongestCol
{
	public static void main(String args[])
	{
		int length;
			long seq;
			int num =0 , lenF =0 ,tlen =0;
			int cach[] = new int[5000001];
			cach[0] = 0;
			cach[1] = 1;
			int mnu[]  = new int[5000001];
			for(int i = 2; i<=5000000; i++)
			{
				length = 0;
				seq = (long)i;
				while(seq!=1 && seq>=i)
				{
					length++;
					if(seq%2 == 0)
					{
						seq = seq/2;
					}
					else
					{
						seq = (3*seq)+1;
					}
				}
				if(seq<i)
					{
						length = length+cach[(int)seq];
					}
				cach[i] = length;
				if(length>=lenF)
				{
					lenF = length;	
				}
			}
			tlen = 0;
			int tnum = 0;
			for(int i =2; i<=5000000 ; i++)
			{
				
				if(cach[i]>=tlen)
				{
					tlen = cach[i];
					tnum = i;
					mnu[i] = tnum;
				}
				else
				{
					mnu[i] = tnum;
				}
			}
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t>0)
		{
			int n = scanner.nextInt();
			
			System.out.println(mnu[n]);
			t--;
		}
	}
	
}