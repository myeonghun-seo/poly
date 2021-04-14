import java.util.*;

public class Ex08_02 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap = 0;
		
		for(int i = 0; i < aa.length; i++)
		{
			System.out.print(i+1 + "번째 숫자를 입력하세요 : ");
			aa[i] = s.nextInt();
			hap += aa[i];
		}
		
		System.out.println();
		System.out.println("합계 ==> " + hap);
		System.out.println();
		
		for(int i = 0; i < aa.length; i++)
		{
			System.out.println("aa[" + i + "] = " + aa[i]);
		}
	}

}
