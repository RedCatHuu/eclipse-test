package lesson2.practice.chapter2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("曜日を入力してください：");
		String week = new Scanner(System.in).nextLine();
		System.out.println(DayOfWeek.valueOf(week).getWayaku());
	}

}
