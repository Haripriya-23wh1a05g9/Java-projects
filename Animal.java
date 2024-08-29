package programs;

class tin {
	public void dog(){
		System.out.println("dog");
	}
}
class cat extends Animal{
	public void show() {
		System.out.println("cat");
	}
}
public class Animal{
	public static void main(String[] args)
	{
		cat obj = new cat();
		obj.show();
	}
	
}
