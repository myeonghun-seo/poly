
public class Test06 
{

	public static void main(String[] args) 
	{
		int m = 0;
		
		for(int i = 0; i < 9; i++)
		{
			if(i < 4)m = i;
			else m = 8 - i;
			
			for(int j = 0; j <= m; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
