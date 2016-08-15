import java.util.Scanner;
class LargestSum
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str[] = new String[n];
		String sum = " ";
		String tsum3;
		int tsum =0 , tsum2;
		scanner.nextLine();
		for(int i =0;i<n;i++)
		{
			str[i] = scanner.nextLine();

		}
		for(int i =49; i>=0; i--)
		{
			for(int j=0 ; j<n ; j++)
			{
				tsum = tsum + Integer.parseInt(str[j].substring(i,i+1));
			}
			if(i!=0)
			{
				tsum2 = tsum%10;
			}
			else
			{
				tsum2 = tsum;
			}
			tsum = tsum/10;
			tsum3 = Integer.toString(tsum2);
			sum = tsum3.concat(sum);
		}
		System.out.println(sum.substring(0,10));
	}
}