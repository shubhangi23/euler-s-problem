import java.util.Scanner ;
class EvenFib
{
	public static void fib(long n)
	{
		long i = 1 , j = 1 , f =0 , sum = 0;
		while(f<= n)
		{
			
			if (f%2 == 0)
			{
				sum = sum + f;
			}
			f = i+j;
			i = j;
			j = f;
		}
		System.out.println(sum);
	}
}

class Evenimp
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		while(s>0)
		{
			long n = in.nextLong();
			EvenFib ef = new EvenFib();
			ef.fib(n);
		}
	}
}