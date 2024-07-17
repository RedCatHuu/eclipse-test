package extend.human;

public class Extends01 {

	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 16);
		System.out.println(sugimoto.getName());
		
		Student sato = new Student("佐藤", 17, 70);
		System.out.println(sato.getName());
		System.out.println(sato.getStudentProfile());
	}

}
