import java.util.Scanner;
class LongestCol
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t>0)
		{
			int n = scanner.nextInt();
			int length;
			long seq;
			int num =0 , lenF =0;
			int cach[] = new int[5000001];
			cach[0] = 0;
			cach[1] = 1;
			for(int i = 2; i<=n; i++)
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
					num = i;
				}
			}
			System.out.println(num);
			t--;
		}
	}
}