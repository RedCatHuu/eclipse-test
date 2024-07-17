package extend.animal;

public class Dog extends Animal {
	public Dog() {
		name = "犬";
	}
	
	public void cry() {
		System.out.println(name + "が吠えました。ワン！");
	}

}
