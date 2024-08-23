package programs;
class sing{
	public void display() {
		System.out.println("I love listening music");
	}
}
class singer extends sing{
	public void display() {
		System.out.println("I love singing songs");
	}
}

public class overriding_of_method {
	public static void main(String[] args){
		singer s1 = new singer();
		sing s2 = new sing();
		s1.display();
		s2.display();
		
	}

}
