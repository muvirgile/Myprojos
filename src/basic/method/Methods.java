package basic.method;

public class Methods {

	int a = 10;

	static int c = 100;

	void read() {
		System.out.println(c);
	}

	public static void main(String[] args) {

		int B = 20;
		System.out.println("value of b is " + B);
		Methods p = new Methods();
		System.out.println(p);
		System.out.println(c);
	}
}
