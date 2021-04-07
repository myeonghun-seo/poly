public class Ex07_11 
{

	public static void main(String[] args)
	{
		int hap = 0;
		int i;
		
		for(;;)
		{
			for(i = 1; i <= 100; i++)
			{
				hap += i;
				
				if(hap > 2000) 
				{
					System.out.println("합계 : "+ hap);
					hap=0;
					//break;
					return;
				}
				
			}
		
			System.out.println("아직도 반복중");
		}
		
	}

}
