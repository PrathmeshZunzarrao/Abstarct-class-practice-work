package abstractionPractice;

public class ABCDriver {

	public static void main(String[] args) {
		
		Test2 t1 = (Test2) new Test1();
		
		t1.add();
		t1.sum();
		t1.welcome();
		
	}

}