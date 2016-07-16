import java.util.Scanner;
class Small
{
	public static void main(String str [])
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int j = 0, flag =0;
		while(t>0)
		{
			int n = in.nextInt();

			while(true)
			{
				j = j+n;
				flag = 0;
				for(int i = 1 ; i<n ; i++)
				{
					if(j%i == 0)
					{
						flag++;

					}
				}
				if(flag == n-1)
				{
					System.out.println(j);
					break;
				}
			}
			j = 0;
			t--;
		}
			
	}
		
}