import java.util.*;

public class Ex06_06 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int menu;
		
		do 
		{
			System.out.printf("\n손님 주문하시겠습니까?\n");
			System.out.println("1. 까페라떼 2. 까푸치노 3. 아메리카노 4. 그만시킬게요");
			menu = s.nextInt();
			
			switch(menu)
			{
			case 1:
				System.out.println("카페라떼 주문하셨습니다.");
				break;
			case 2:
				System.out.println("까푸치노 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 4:
				System.out.println("주문하신 커피를 준비하겠습니다.");
				break;
			default:
				System.out.println("잘못 주문하셨습니다.");
				break;
			}
		
		}while(menu != 4);
	}

}
