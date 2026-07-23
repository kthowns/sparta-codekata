package lev4;

class Fibonachi {
	// 82-lev4-멀리 뛰기
	public long solution(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}

		long a = 1;
		long b = 2;
		long sum = 0;

		for (int i = 3; i <= n; i++) {
			sum = (a + b) % 1234567;
			a = b;
			b = sum;
		}

		return sum;
	}
}