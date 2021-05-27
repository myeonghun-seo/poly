class Car3
{
	private String color;
	private int speed;
	
	Car3(String color, int speed)
	{
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
}

public class Ex11_07 
{

	public static void main(String[] args) 
	{
		Car3 myCar1 = new Car3("빨강", 0);
		Car3 myCar2 = new Car3("파랑", 30);
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차1의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km 입니다.");

	}

}
