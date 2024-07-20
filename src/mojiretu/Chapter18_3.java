package mojiretu;

public class Chapter18_3 {

	public static void main(String[] args) {
		
		System.out.println( "123-4567".matches("[1-9]{3}-[1-9]{4}"));
		// \d{3}-\d{4}
		
		System.out.println( "070-1234-5678".matches( "0[7-9]0-[1-9]{4}-[1-9]{4}") );
		
		String timeStd = "([01]\\d|[2][0123]):[0-5]\\d";
		System.out.println("23:59".matches(timeStd));
		System.out.println("05:04".matches(timeStd));
		System.out.println("23:549".matches(timeStd));
	}
	
}
