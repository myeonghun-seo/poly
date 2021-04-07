import java.util.*;

public class Ex07_03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true)
		{
			System.out.print("더할 첫 번쨰 수 입력 : ");
			a = sc.nextInt();
			System.out.print("더할 두 번쨰 수 입력 : ");
			b = sc.nextInt();
			
			System.out.println("합계 : " + (a + b));
			
			//합계가 10보다 크면 나가기
			if(a+b > 10)break;
		}
		
	}

}
