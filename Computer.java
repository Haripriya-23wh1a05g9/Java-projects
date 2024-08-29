package programs;

public class Computer {
	
	String brand = "hp";
	int speed = 2100;
	class processor{
		public void displayDetails()
		{
			System.out.println(brand);
			System.out.println(speed);
		}
	}


public static void main(String[] args)
{
	Computer obj = new Computer();
	processor obj1 = obj.new processor();
	obj1.displayDetails();
}	
}