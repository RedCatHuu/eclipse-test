package extend.phone;

public class FlyingPhone implements Phone, Flying {
	int minutes;
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	
	@Override
	public void fly() {
		System.out.println( minutes + "分間、飛びます。");
	}
	
	public void call(String number) {
		
	}
	
	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}

}
