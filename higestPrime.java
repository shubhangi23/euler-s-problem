import java.util.Scanner;
import java.lang.Math;
class HigestPrime
{
	public static void primenum (long n)
	{
		boolean isPrime1, isPrime2;
		long low = 2;
		long s = n;

		long sqt = (long)Math.sqrt(n)+2;
		int flag = 0 , k=0 ,l = 0; 
			while(s%2 ==0)
			{
				s = s/2;
				flag = 1;
				k =1;
				
			
			}
		
		if(flag ==1)
		{
		low = 2;
		}
		for (long fact = 3; fact<=sqt ; fact=fact+2)
		{
			l = 0;
			while(s%fact == 0)
			{
				s=s/fact;
				k = 1;
				l = 1;
				
			}
			if(l == 1)
			{
				low = fact;
			}

		}
		if (k == 0)
		{
			low = n;
		}
		
		if(k!= 0 && s!=1 && l==0)
		{ 
			low = s;
		}
		

		System.out.println(low); 
	
	}
	

}
class CheckPrime
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t>0) 
		{
			long n = in.nextLong();
			HigestPrime hp = new HigestPrime();
			hp.primenum(n);
			t--;
		}
	}
}