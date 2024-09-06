package test.com;

public class Test05_3 {

	//		1 ~ 10 사이의 어떤 수로도 나누어
	//		떨어지는 가장 작은 수는 2520입니다.
	//		그러면 1 ~ 20 사이의 어떤 수로도
	//		나누어 떨어지는 가장 작은 수는 얼마입니까?
	public static void main(String[] args) {
		long result = 1;

		for (int i = 1; i <= 20; i++) {
			result = lcm(result,i);
		}

		System.out.println(result);

	}//end main

	//최소공배수 구하는 방법
	public static long lcm(long a,long b){
		return (a * b) / gcd(a,b);
	}


	//최대공약수 구하는 방법
	public static long gcd(long a,long b){
		while (b!=0){
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}//end class