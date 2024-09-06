package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class C02_BinarySearch5Product {
	// --- 제품 데이터 모델명 가격 ---//

	static class Product{
		private String mode;
		private int price;

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Product(String mode, int price) {
			this.mode = mode;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product{" +
					"mode='" + mode + '\'' +
					", price=" + price +
					'}';
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//가격이 3000 같은 객체 찾기
		Product[] ps = new Product[]{
				new Product("a001",1000),
				new Product("a002",2000),
				new Product("a003",3000),
				new Product("a004",4000)
		};

		int idx = Arrays.binarySearch(ps,
				new Product("",4000),
				new Comparator<Product>() {
					@Override
					public int compare(Product o1, Product o2) {
						return o1.getPrice()>o2.getPrice()?1:o2.getPrice()>o1.getPrice()?-1:0;
					}
				});
		System.out.println(ps[idx]);

	}
}