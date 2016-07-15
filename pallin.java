import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.io.*;
class Palli
{
	public static boolean isPalli(long p)
	{
		String strLong = Long.toString(p);
		int len = strLong.length();
		String l1 = strLong.substring(0, len/2);
		String l2 = strLong.substring(((len+1)/2), len);
		String reverse = new StringBuffer(l2).reverse().toString();
		if (l1.equals(reverse)) {
			return true;
		}
		else
		{
			return false;
		}

	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t>0)
		{
		long n = in.nextLong();
		Palli p = new Palli();
		int i = 0 ,s =999;
		n = n-1;
		while(p.isPalli(n) == false)
		{
			n--;
		}
		while(true)
		{
			for(i = s; i>99; i--)
			{
				s = i;

				if(n%i == 0)
				{
					
					break;
				}

			}
			if(n/i>99 && n/i<1000)
			{

				System.out.println(n);
				break;
			}
			
			else{	if(i>100)
				{	s=i-1;
					continue;
				}
			}
			
				n--;

				while(p.isPalli(n) == false)
				{
					n--;
				}
				s = 999;
				
			
			}
		
		
			t--;
		}
	

	}
}