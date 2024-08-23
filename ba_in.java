package programs;

class Job{

			int salary = 100000;
		}
		class engineer extends Job{
			int bonas = 10000;
		}
		public class ba_in {
			public static void main(String[] args) {
				engineer e1 = new engineer();
				System.out.println("salary:"+e1.salary+" "+"\nbonas:"+e1.bonas);
			}
		}




