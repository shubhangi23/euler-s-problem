import java.util.Scanner ;
class Multiples
{
	public static void multi(long n)
	{ 
		long i , j , k;
		long th = n/3;
		long fi = n/5;
		long fif = n/15;
		long s1 = 0 , s2 = 0, s3 = 0;
		long sum = 0;
		if (th*3 == n)
		{
			th--;
		}
		if (fi*5 == n)
		{
			fi--;
		}
		if (fif*15 == n)
		{
			fif--;
		}
		s1 = (th*(3+(3*th)))/2;
		s2 = (fi*(5+(5*fi)))/2;
		s3 = (fif*(15+(15*fif)))/2;
		sum = (s1+s2) - s3;
		System.out.println(sum);

	}
}
class Multiimp
{
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t>0)
		{
			long n = in.nextInt();
			Multiples m = new Multiples();
			m.multi(n);
			t--;
		}
	}
}