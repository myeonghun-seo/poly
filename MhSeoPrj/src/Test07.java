
public class Test07 
{

	public static void main(String[] args) 
	{
		int num = 5;
		int m = 0;
		int n = 0;
		
		for(int i = 0; i < num; i++)
		{
			if(i < (num-1) / 2)
			{
				m = (i * 2) + 1;
				n = num - i - 3; 
			}
			else 
			{
				m = (((num - 1) - i)*2)+1;
				n = i - 2;
			}
			
			for(int j = 0; j < n; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < m; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
