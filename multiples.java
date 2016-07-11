import java.util.Scanner ;
class Multiples
{
	public static void multi(int n)
	{ 
		int i , j , k;
		int th = n/3;
		int fi = n/5;
		int fif = n/15;
		int s1 = 0 , s2 = 0, s3 = 0;
		int sum = 0;
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
		for ( k = 1 ; k<=fif ; k++ )
		{
			s3 = s3 + (15*k);
			s1 = s1 + (3*k);
			s2 = s2 + (5*k);
		}
		for ( j = k ; j<=fi ; j++ )
		{
			s1 = s1 + (3*j);
			s2 = s2 + (5*j);
		}
		for ( i = j ; i<=th ; i++ )
		{
			s1 = s1 + (3*i);
		}
		sum = (s1+s2) - s3;
		System.out.println(sum);

	}
}
class Multiimp
{
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0)
		{
			int n = in.nextInt();
			Multiples m = new Multiples();
			m.multi(n);
			t--;
		}
	}
}
