package programs;

public class di_me_over {
	public int sum (int x,int y) {
		return (x+y);
	}
	public double sum(double x,double y) {
		return (x+y);
	}
	public String sum(String a)
	{
		return (a);
	}
	public static void main(String[] args) {
		di_me_over s = new di_me_over();
		System.out.println(s.sum("haripriya"));
		System.out.println(s.sum(17.5,20.5));
		System.out.println(s.sum(10,20));
	}
}
