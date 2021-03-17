
public class Ex03_07 
{

	public	static void main(String[] args)
	{
		int a;		// 정수형 변수 a를 선언했다.
		float b;	// 실수형 변수 b를 선언했다.
		
		a = (int)123.45f;	// 정수형 변수에 실수를 대입했다. -> 바람직하지 않다. 오류를 방지하기 위해서 
							// (int)룰 븉여서 정수르 변환한다.
		b = 200;			// 실수형 변수에 정수를 대입했다. -> 바람직하지 않다.
							// 하지만, 상위로 형변환이기에 암묵적 변환이 된다.
		
		System.out.printf("a의 값 ==> %d \n", a);
		System.out.printf("b의 값 ==> %f \n", b);
	}
	
}
