
public class chap09_ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print( i + "*" + j + "=" + i * j );
			}
			System.out.println();
		}
		
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b) + "です。");
		
	}

	static int gcd(int a, int b) {		
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

}
