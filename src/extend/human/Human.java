package extend.human;

public class Human {
	private String name;
	protected int age;
	protected int score;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 引数の数は同じだが、型が違うため問題なし
	public Human(String name) {
		this.name = name;
	}
	
	// ageのみを設定するコンストラクタ
	public Human(int age) {
		this.age = age;
	}
	
	// ageのみのコンストラクタとシグネチャが重複するため不可
	/*
	public Human(int score) {
		this.score = score;
	}
	*/
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
