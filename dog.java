package programs;

public class dog {
	String name;
	String color;
	public dog(String a,String b) {
		name = a;
		color = b;
	}
	public static void main(String[] args)
	{
		
		dog obj1 = new dog("zebra","black");
		
		System.out.println(obj1.name);
		System.out.println(obj1.color);
		
		
	}

}
