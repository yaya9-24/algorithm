package test.com;

public class Test05_2 {

	public static void main(String[] args) {

//		1 ~ 10 사이의 어떤 수로도 나누어 
//		떨어지는 가장 작은 수는 2520입니다.
//		그러면 1 ~ 20 사이의 어떤 수로도 
//		나누어 떨어지는 가장 작은 수는 얼마입니까?

		long result = findMinSu(1, 20);
		System.out.println("result: " + result);// 232792560
	}

	// 최소 공배수를 이용하여 1부터 20까지의 모든 수로 나누어 떨어지는 가장 작은 수
	private static long findMinSu(long start, long end) {
		long result = 1;

		for (long i = start; i <= end; i++) {
			result = getLCM(result, i);//최소 공배수
			System.out.println(result);
		}

		return result;
	}

	// 최소 공배수를 찾기 위해서는 최대공약수가 필요하다.
	private static long getLCM(long result, long i) {
		return (result * i) / getGCD(result, i);
	}

	// 최대 공약수를 찾는 함수
	private static long getGCD(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}