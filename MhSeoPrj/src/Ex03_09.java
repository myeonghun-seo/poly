public class Ex03_09 {

	public static void main(String[] args)
	{
		int a, b, c, d;
		
		a = 100 + 100; 	// a에 두 숫자의 계산 결과를 대입한다.
		b = a + 100;	// b에 변수의 숫자의 계산 결과를 대입한다.
		c = a + b -100;	// c에 변수의 계산 결과의 숫자의 계산결과를 대입한다.
		d = a + b + c;	// d에 a, b, c의 덧셈 결과를 대입한다.

		System.out.println("a, b, c, d의 값 ==> " + a + ", "+ b +", "+ c + ", " + d);

		a = b = c = d = 100; // a, b, c, d에 모두 값은 100을 대입한다.(한 문장으로 처리)
		System.out.println("a, b, c, d의 값 ==> " + a + ", "+ b +", "+ c + ", " + d);
		
		a = 100;
		a = a +200;	// 자신의 a 결과 200을 더한 값을 다시 a에 대입한다.
		System.out.println("a의 값 ==> " + a);
		
		
	}
	
}
