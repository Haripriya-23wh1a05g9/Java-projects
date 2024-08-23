package programs;

public class me_over {
		public int sum(int x){
			return (x);
		}
		public int sum (int y,int x){
			return (x+y);
		}
		public static void main(String[] args)
		{
			me_over myobj = new me_over();
			System.out.println(myobj.sum(10,20));
			System.out.println(myobj.sum(10));
		}
	}

