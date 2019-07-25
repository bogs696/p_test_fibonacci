
public class Fibonacci {
	private int numFirst, numLast;

	public Fibonacci() {
		numFirst = 1;
		numLast = 0;
	}

	public int next() {
		numLast = numLast + numFirst;
		numFirst = numLast - numFirst;
		return numLast;
	}

	public int next(int step) {
		for (int i = 1; i < step; i++) {
			next();
		}
		return next();
	}

	public int prev() {
		numFirst = numLast - numFirst;
		numLast = numLast - numFirst;
		return numLast;
	}

	public int prev(int step) {
		for (int i = 1; i < step; i++) {
			prev();
		}
		return prev();
	}

	public int thisNum() {
		return numLast;
	}
}
