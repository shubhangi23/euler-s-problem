import java.util.Scanner;
class Dignol
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int ar[][] = new int[20][20];
		int space = -1;
		Long temp1 =0L;
		int count =0;
		int k =0;
		int z =0;
		
		for(int i =0 ; i<20 ; i++)
		{   
			space = -1;
			String temp = in.nextLine();
			temp.trim();
			for(int j = 0; j<20 ; j++)
			{

				if(j<19)
				{
					
					ar[i][j] = Integer.parseInt(temp.substring(space+1 ,temp.indexOf(" " ,space+1)));
				}
				else
				{
					
					
					String rtemp = temp.substring(space+1,(temp.trim().length()));
					ar[i][j] = Integer.parseInt(rtemp);
				}
				space = temp.indexOf(" " ,space+1);
			}	 
		}
		Long prod = 0L;
			//slant down
			for(int i = 0 ; i<20 ; i++)
			{	
				
				if(i+3<20){
				for(int j =0 ; j+3<20; j++)
				{
						
						temp1 = ((long)ar[i][j])*ar[i+1][j+1]*ar[i+2][j+2]*ar[i+3][j+3];;
						
				if (prod<temp1)
				{
					prod = temp1;
				}
				temp1 =0L;
			}
		}
		else
		{
			break;
		}
	}
			
			// slant up
		
				for(int i = 0 ; i<20 ; i++)
			{
				if(i-3>=0){
			for(int j = 0;j+3<20 ; j++)
			{
				
					 
					temp1 = ((long)ar[i][j])*ar[i-1][j+1]*ar[i-2][j+2]*ar[i-3][j+3];
					
			if(prod<temp1)
			{
				prod=temp1;
			}

			temp1 = 0L;
		}
		}
		
		}
		
		// right
			
				for(int i = 0 ; i<20 ; i++)
			{
				
				for(int j =0;j+3<20;j++)
				{
					
						
						temp1 = ((long)ar[i][j])*ar[i][j+1]*ar[i][j+2]*ar[i][j+3];
						
				if(prod<temp1)
				{
					prod = temp1;
				}
				temp1=0L;
			}
			 
			//down
			
			}
				for(int i = 0 ; i<20 ; i++)
			{
				if(i+3<20){
				for(int j=0;j<20;j++)
				{
					
						 
						temp1 = ((long)ar[i][j])*ar[i+1][j]*ar[i+2][j]*ar[i+3][j];
				
				if(prod<temp1)
				{
					prod = temp1;
				}
				temp1 = 0L;
			}
			}
			else
			{
				break;
			}
			}
		System.out.println(prod);
	}

	}