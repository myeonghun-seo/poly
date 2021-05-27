class Car2
{
	private String color;
	private int speed;
	
	Car2(){
		color = "빨강";
		speed = 0;
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

public class Ex11_06 
{

	public static void main(String[] args) 
	{
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2();
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차1의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km 입니다.");

	}

}
