package programs;

class shapes {
	int l = 10;
	int b = 20;
	int area;
	public void getrid() {
		System.out.println(area);
	}
}
class rect extends shapes{
		public void rectangle() {
			area = l*b;
			System.out.println(area);
		}
	}
public class shape {
	public static void main(String[] args)
	{
		rect obj = new rect();
		obj.rectangle();
	}
}
