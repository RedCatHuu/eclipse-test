package mojiretu;

import java.util.Scanner;

public class Chapter15_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String line = sc.nextLine();
			if(line.equals("exit")) {
				break;
			}
			sb.append(line);
		}
		System.out.println(sb.toString());
		sc.close();
		
        int hour = 10;
        int minute = 30;
        int second = 45;
        int milliSecond = 123;
        String additionalMessage = "正確です";

        String message = String.format("現在の時刻は%d時%d分%d秒%dミリ秒です。%s", hour, minute, second, milliSecond, additionalMessage);
        System.out.println(message);

	}

}
