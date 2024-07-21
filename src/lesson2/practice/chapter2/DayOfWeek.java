package lesson2.practice.chapter2;

public enum DayOfWeek {
	Sun("日曜日"), Mon("月曜日"), Tue("火曜日"), Wed("水曜日"), Thu("木曜日"), Fri("金曜日"), Sat("土曜日");
	
	private String wayaku;
	
	private DayOfWeek(String wayaku) {
		this.wayaku = wayaku;
	}
	
	public String getWayaku() {
		return this.wayaku;
	}
}
