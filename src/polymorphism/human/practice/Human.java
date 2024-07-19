package polymorphism.human.practice;

public class Human {
	private int hp = 100;
	
	public void doSleep() {
		hp += 50;
		System.out.println("hp=" + hp);
	}
	
	public void work() {
		
	}


	public static void main(String[] args) {
		Human[] h = new Human[] { 
				new Student(), 
				new Programmer(), 
				new Driver(), 
		};

		for (Human hm : h) {
			if(hm instanceof Programmer) {
				Programmer pg = (Programmer)hm;
				pg.study();
				pg.work();
			}else {
				hm.work();
			}
			
		}
	}

}
