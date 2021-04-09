
public class Pr_02 
{

	public static void main(String[] args) 
	{
		int i, j;
		
		i = 2;
		
		while(i < 10)
		{
			j = 1;
			
			while(j < 10)
			{
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			
			System.out.println();
			i++;
			
		}
		
	}

}
