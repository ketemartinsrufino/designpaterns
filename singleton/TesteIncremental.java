
class Incremental {

	private static int count = 0;
	private int num;
	
	private static Incremental myIntance;
	
	private Incremental(){
		num = ++count;
	}
	
	public static Incremental getInstance() {
		if(myIntance == null) {
			myIntance = new Incremental();
		}
		return myIntance;
	}
	
	public String toString() {
		return "Incremental " + num;
	};
}

public class TesteIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstance();
			System.out.println(inc);
			
		}
	}
	
}
