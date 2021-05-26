
class Car
{
	String color;
	int speed;
	
	void upspeed(int value) 
	{
		speed += value;
	}
	
	void downspeed(int value) 
	{
		speed -= value;
	}
}

public class Ex11_01 
{

	public static void main(String[] args) 
	{
		Car myCar1 = new Car();
		myCar1.color = "빨강";
		myCar1.speed = 0;

		Car myCar2 = new Car();
		myCar2.color = "파랑";
		myCar2.speed = 0;

		Car myCar3 = new Car();
		myCar3.color = "노랑";
		myCar3.speed = 0;

		myCar1.upspeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km 입니다.");

		myCar2.upspeed(60);
		System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km 입니다.");

		myCar3.upspeed(0);
		System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재 속도는 " + myCar3.speed + "km 입니다.");

		// new 로 생서오딘 객체는 반드시 null을 저장해서 메모리에서 제거를 하자.
		myCar1 = null;
		myCar2 = null;
		myCar3 = null;
		
	}
	
}

