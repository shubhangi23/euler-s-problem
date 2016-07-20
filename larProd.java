import java.util.Scanner;
class LarProd
{
	public static void main(String arg[])
	{
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	in.nextLine();
	while(t>0)
	{
		String s1 = in.nextLine();
		int space = s1.indexOf(" ");
		String sk = s1.substring(0,space);
		int k = Integer.parseInt(sk);
		String sn = s1.substring(space+1,s1.length());
		int n = Integer.parseInt(sn);
		String s2 = in.nextLine();
		int ar[] = new int[k];
		long max =0, prod = 1;
		//space = s2.indexOf(" ");
		ar[0] = Integer.parseInt(s2.substring(0,1));
		
		for(int i =1; i<k ; i++)
		{
			
			ar[i] = Integer.parseInt(s2.substring(i,i+1));
		}
		for(int j =0; j<k-n; j++ )
		{
			for(int s = j; s<j+n ; s++)
			{
				prod = prod*ar[s];
			}
			if(prod>max)
			{
				max = prod;
				
			}
			prod = 1;
		}
		System.out.println(max);
		t--;
	}

	}
}