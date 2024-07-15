package classmethod.human;

public class Human04 {
    // メンバー変数
	// static変数
	static public int humanCount = 0;
    // インスタンス変数
	public String name;
	// 定数
	public static final String GREETING = "こんにちは";

	public Human04(String name) {
		this.name = name;
		// インスタンス生成ごとにstatic変数をインクリメント
		Human04.humanCount++;
	}

	static public void staticMethodPrint() {
		// staticメソッドからインスタンス変数は使用できない（コンパイルエラー）
		// System.out.println("名前は、" + name);
		// static変数のhumanCountを表示
		System.out.println("人の数は" + Human04.humanCount);
	}

	public void instanceMethodPrint() {
		// インスタンス変数のnameを表示
		System.out.println("名前は" + name);
	}



	public static void main(String[] args) {
		// Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
		Human04 yamada = new Human04("山田");

		// 静的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();

		// staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);

		// インスタンスメンバーは直接使用できない（コンパイルエラーになる）
		// Human04.instanceMethodPrint();
		// System.out.println(Human04.name);

		// インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
		System.out.println(yamada.name);
		System.out.println(Human04.humanCount);
	}
}

