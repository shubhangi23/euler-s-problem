import java.util.Scanner;
class naturalSum
{
	public static void main(String agrs[])
	{
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t>0)
		{
			long n = in.nextLong();
	        long s1 = (n*(1+n))/2;
	        s1 = s1*s1;
	        //System.out.println(s1);
	        long s2 = (n*(n+1)*((2*n)+1))/6;
	        //System.out.println(s2);
	        System.out.println(s1-s2);
	        t--;
    	}

	}
}