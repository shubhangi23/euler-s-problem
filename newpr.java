import java.util.Scanner;
class Dignol
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int ar[][] = new int[20][20];
		int space = -1;
		Long temp1 =1L;
		int count =0;
		int k =0;
		int z =0;
		for(int i =0 ; i<20 ; i++)
		{   
			String temp = in.nextLine();
			for(int j = 0; j<20 ; j++)
			{
				if(j<19)
				{
					ar[i][j] = Integer.parseInt(temp.substring(space+1 ,temp.indexOf(" " ,space+1)));
				}
				else
				{
					ar[i][j] = Integer.parseInt(temp.substring(space+1 ,temp.length()));
				}
				space = temp.indexOf(" " ,space+1);
			}	 
		}
		Long prod = 1L;
		while(count<20)
		{
			for(int i = 0 ; i<20 ; i++)
			{	
				// slant ddown
				if(i+3<20){
				for(int j =i , s = i ; j<20&&s<20 ; j++)
				{
					if(z<4)
					{
						temp1 = temp1*ar[s][j];
						s++;
						z++;
					}
					else
					{
						break;
					}
				}
				z=0;
				if (prod<temp1)
				{
					prod = temp1;
				}
				temp1 =1L;
			/*}
			// slant up
			if(i+3<20){*/
			for(int j = i, s=i;j<20&&s>=0 ; j++)
			{
				if(z<4)
				{
					temp1 = temp1*ar[s][j];
					s--;
					z++;
				}
				else
				{
					break;
				}
			}
			z=0;
			if(prod<temp1)
			{
				prod=temp1;
			}
			temp1 = 1L;
		/*}
		// right
			if(i+3<20)
			{*/
				for(int j =i;j<20;j++)
				{
					if(z<4)
					{
						temp1 = temp1*ar[j][i];
						z++;
					}
					else
					{
						break;
					}
				}
				z=0;
				if(prod<temp1)
				{
					prod = temp1;
				}
				temp1=1L;
			/*}
			//down
			if(i+3<20)
			{*/
				for(int j=i;j<20;j++)
				{
					if(z<4)
					{
						temp1 = temp1*ar[i][j];
						z++;
					}
					else
					{
						break;
					}
				}
				z=0;
				if(prod<temp1)
				{
					prod = temp1;
				}
				temp1 = 1L;
			}
		}
			count++;

		}
		System.out.println(prod);

	}
}