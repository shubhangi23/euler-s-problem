import java.util.*;
import java.math.BigInteger;

class Prob16
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t>0)
		{
			int l = scanner.nextInt();
			BigInteger n = BigInteger.valueOf(2);
			n = n.pow(l);
			System.out.println(calcDigits(n.toString()));
			t--;
		}
	}

	public static int calcDigits(String s)
	{
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		}
		
		return sum;
	}
}