package polymorphism.human.practice;

public class Programmer extends Human {
	public void study() {
		System.out.println("プログラムを書きます");
	}
	
	@Override
	public void work() {
		System.out.println("技術書を読みます");
	}
}
