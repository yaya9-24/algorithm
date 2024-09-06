package chap02;
// 1,000 이하의 소수를 나열(버전 1）

class C04_Integer_toString {
	public static void main(String[] args) {
//		10진수를 2진수,8진수,16진수 문자열 변환 : 

		int sum = 59;
//    	 10진수 59를 2진수로 변환하는 모습이다.
		System.out.println(sum + " : " + Integer.toString(sum, 2));// 111011

//    	 10진수 59를 8진수로 변환하는 모습이다.
		System.out.println(sum + " : " + Integer.toString(sum, 8));// 73 7*8+3

//    	 10진수 59를 16진수로 변환하는 모습이다.
		//0123456789ABCDEF
		System.out.println(sum + " : " + Integer.toString(sum, 16));// 3b 16*3+11
		
//    	 10진수 59를 32진수로 변환하는 모습이다.
		//0123456789ABCDEFGHIJKLMNOPQRSTUVW
		System.out.println(sum + " : " + Integer.toString(sum, 32));// 1r 32*1+27
		
//    	 10진수 59를 36진수로 변환하는 모습이다.
		//0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ
		System.out.println(sum + " : " + Integer.toString(sum, 36));// 1r 36*1+23
		System.out.println("=============");

	}
}