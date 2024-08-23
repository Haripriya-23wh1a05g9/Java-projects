package programs;
import java.util.Scanner;
public class stu_det {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter your name:");
		String s = s1.nextLine();
		System.out.println("enter your roll.no:");
		int num = s1.nextInt();
		System.out.println("enter which class you are studying in:");
		int std = s1.nextInt();
		System.out.println("enter branch:");
		String branh = s2.nextLine();
		System.out.println("My name is "+ s);
		System.out.println("my roll.no:"+num);
		System.out.println("I am studying in:"+std);
		System.out.println("Brach is:"+branh);
		
	}

}
