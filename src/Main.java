
public class Main {

	public static void main(String[] args) {
		//pain();
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci.prev());
		}
		System.out.println("**********************");
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci.next());

		}
		System.out.println("**********************");

		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci.next());
		}
	}
	private static Fibonacci fibonacciPAIN = new Fibonacci();
	/**
	 * don't use
	 */
	public static void pain() {
		System.out.println("Pain="+fibonacciPAIN.thisNum());
		if(fibonacciPAIN.next()!=55) {
			pain();
		}
	}

}
