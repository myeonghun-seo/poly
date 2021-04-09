import java.util.*;

public class Ex05_09 
{

	
	private static Scanner sc;

	public static void main(String[] args) 
	{

		sc = new Scanner(System.in);
		int a;
		
		System.out.print("1~4 중에 선택하세요 : ");
		a = sc.nextInt();
		
		switch(a) 
		{
		case 1 : 
			System.out.println("1을 선택했다.");break;
			
		case 2 : 
			System.out.println("2를 선택했다.");break;
			
		case 3 : 
			System.out.println("3을 선택했다.");break;
			
		case 4 : 
			System.out.println("4를 선택했다.");break;
			
		default : 
			System.out.println("이상한 걸 선택헀다."); 
			
		}
	
	}
}
