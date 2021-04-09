import java.util.Scanner;

public class Ex05_08 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("점수를 입력하세요 : ");
		a = sc.nextInt();
		
		if(a >= 90)
			
			System.out.println("A");

		else if(a >= 80)
			
			System.out.println("B");
		
		else if(a >= 70)
			
			System.out.println("C");
		
		else if(a >= 60)
			
			System.out.println("D");
		
		else
			
			System.out.println("F");
	}

}
