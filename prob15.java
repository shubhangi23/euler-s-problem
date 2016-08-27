import java.util.Scanner;
class prob15
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		long a[][] = new long[501][501];
		for(int i=0; i<501; i++)
		{
			for(int j=0; j<501; j++)
			{
				a[i][j] = 1;
			}
		}

		for(int i=1; i<501; i++)
		{
			for(int j=1; j<501; j++)
			{
				a[i][j] = (a[i][j-1]+a[i-1][j])%1000000007;
			}
		}
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t>0)
		{
			String l = scanner.nextLine();
			int n = Integer.parseInt(l.substring(0, l.indexOf(" ")));
			int m = Integer.parseInt(l.substring(l.indexOf(" ")+1, l.length()));
			System.out.println(a[n][m]);
		}
	}
}