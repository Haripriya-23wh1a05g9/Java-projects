package programs;

public class con_with_p {
	char x;
	public con_with_p(char y){
		x = y;
	}
	public static void main (String[] args) {
		con_with_p myobj1 = new con_with_p('s');
		System.out.println(myobj1.x);
	}

}
