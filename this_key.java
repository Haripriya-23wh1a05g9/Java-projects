package programs;

public class this_key {
	void age() {
		this.name();
		System.out.println("18");
	}
	void name() {
		System.out.println("haripriya");
	}
	public static void main(String[] args) {
		this_key s = new this_key();
		s.age();
	}

}
